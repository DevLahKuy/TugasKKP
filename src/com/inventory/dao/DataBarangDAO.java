
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelDataBarang;
import com.inventory.model.ModelJenisBarang;
import com.inventory.model.ModelProductBrands;
import com.inventory.model.ModelSatuan;
import com.inventory.model.ModelTypeItems;
import com.inventory.service.ServiceDataBarang;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataBarangDAO implements ServiceDataBarang {
    
    private Connection conn;
    
    public DataBarangDAO(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void addData(ModelDataBarang barang) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO products(product_code, name, product_category_id, product_model_id, "
                    + "product_brand_id, product_unit_id, price, stock) VALUES (?,?,?,?,?,?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, barang.getCodeDataBarang());
            st.setString    (2, barang.getNamaProdukBarang());
            st.setInt       (3, Integer.parseInt(barang.getJnsBarang().getIdJenisBarang()));
            st.setInt       (4, Integer.parseInt(barang.getTypItems().getIdModelTypeItems()));
            st.setInt       (5, Integer.parseInt(barang.getProBrands().getIdProductBrand()));
            st.setInt       (6, Integer.parseInt(barang.getSatuan().getIdSatuan()));
            st.setLong      (7, barang.getPrice());
            st.setInt       (8, barang.getStock());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelDataBarang barang) {
       PreparedStatement st = null;
        try {
            String sql = "UPDATE products SET product_code=?, name=?, product_category_id=?, product_model_id=?,"
                    + "product_brand_id=?, product_unit_id=?, price=?, stock=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, barang.getCodeDataBarang());
            st.setString    (2, barang.getNamaProdukBarang());
            st.setInt       (3, Integer.parseInt(barang.getJnsBarang().getIdJenisBarang()));
            st.setInt       (4, Integer.parseInt(barang.getTypItems().getIdModelTypeItems()));
            st.setInt       (5, Integer.parseInt(barang.getProBrands().getIdProductBrand()));
            st.setInt       (6, Integer.parseInt(barang.getSatuan().getIdSatuan()));
            st.setLong      (7, barang.getPrice());
            st.setInt       (8, barang.getStock());
            st.setInt       (9, barang.getIdDataBarang());
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelDataBarang barang) {
        PreparedStatement st = null;
        String sql = "DELETE FROM products WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, barang.getIdDataBarang());
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelDataBarang> getData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<ModelDataBarang> list = new ArrayList<>();
        String sql = "SELECT p.id, p.product_code, p.name, p.product_category_id, " +
                 "p.product_model_id, p.product_brand_id, p.product_unit_id, " +
                 "p.price, p.stock, " +
                 "pc.name AS category_name, " +
                 "m.name AS model_name, " +
                 "pb.name AS brand_name, " +
                 "s.name AS unit_name " +
                 "FROM products p " +
                 "INNER JOIN productcategories pc ON p.product_category_id = pc.id " +
                 "INNER JOIN productmodels m ON p.product_model_id = m.id " +
                 "INNER JOIN productbrands pb ON p.product_brand_id = pb.id " +
                 "INNER JOIN productunits s ON p.product_unit_id = s.id";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelDataBarang barang = new ModelDataBarang();
                ModelJenisBarang jenisbarang = new ModelJenisBarang();
                ModelTypeItems model = new ModelTypeItems();
                ModelProductBrands productbrands = new ModelProductBrands();
                ModelSatuan unit = new ModelSatuan();
                
                barang.setIdDataBarang(rs.getInt("id"));
                barang.setCodeDataBarang(rs.getString("product_code"));
                barang.setNamaProdukBarang(rs.getString("name"));
                jenisbarang.setNamaJenisBarang(rs.getString("category_name"));
                model.setNameTypeItems(rs.getString("model_name"));
                productbrands.setNameProductBrand(rs.getString("brand_name"));
                unit.setNamaSatuan(rs.getString("unit_name"));
                barang.setPrice(rs.getLong("price"));
                barang.setStock(rs.getInt("stock"));
                
                barang.setJnsBarang(jenisbarang);
                barang.setTypItems(model);
                barang.setProBrands(productbrands);
                barang.setSatuan(unit);
                
                list.add(barang);
            }
          return list;  
        }catch(SQLException e){
            return null;
        }finally{
        // Menutup koneksi dan sumber daya terkait dalam blok finally.
        try{
            if (st != null) st.close();
            if (rs != null) rs.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
        
    }

    @Override
    public List<ModelDataBarang> searchData(String id) {
      PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM products WHERE product_code LIKE '%"+id+"%'"
                + "OR name LIKE '%"+id+"%' "
                + "OR product_category_id LIKE '%"+id+"%' "
                + "OR product_model_id LIKE '%"+id+"%' "
                + "OR product_brand_id LIKE '%"+id+"%' ";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelDataBarang barang = new ModelDataBarang();
                barang.setIdDataBarang(rs.getInt("id"));
                barang.setCodeDataBarang(rs.getString("product_code"));
                barang.setNamaProdukBarang(rs.getString("name"));
            //    barang.setIdJenisBarang().(rs.getInt("product_category_id"));
            //    barang.setIdModelTypeItems(rs.getInt("product_model_id"));
            //    barang.setIdProductBrand(rs.getInt("product_brand_id"));
            //    barang.setIdSatuan(rs.getInt("product_unit_id"));
                barang.setPrice(rs.getLong("price"));
                barang.setStock(rs.getInt("stock"));
                list.add(barang);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;  
    }
    
}
