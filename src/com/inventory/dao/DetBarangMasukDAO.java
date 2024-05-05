
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelBarangMasuk;
import com.inventory.model.ModelDataBarang;
import com.inventory.model.ModelDetBarangMasuk;
import com.inventory.model.ModelJenisBarang;
import com.inventory.model.ModelProductBrands;
import com.inventory.model.ModelTypeItems;
import com.inventory.model.ModelSatuan;
import com.inventory.service.ServiceDetBarangMasuk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class DetBarangMasukDAO implements ServiceDetBarangMasuk {
    
    private Connection conn;
    
    public DetBarangMasukDAO(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void addData(ModelDetBarangMasuk modeldetmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sumTotal(ModelDetBarangMasuk modeldetmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusSementara(ModelDetBarangMasuk modeldetmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelDetBarangMasuk> getData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT det.id, det.product_id, p.name, "
            + "p.product_category_id, p.product_brand_id, p.price, "
            + "det.quantity_incoming, det.subtotal_incoming, "
            + "pc.name AS category_name,"
            + "m.name AS model_name, "
            + "pb.name AS brand_name, "
            + "s.name AS unit_name "
            + "FROM incomingproductdetails det "
            + "INNER JOIN incomingproducts msk ON msk.id = det.id "
            + "INNER JOIN products p ON p.id = det.product_id "
            + "INNER JOIN productcategories pc ON p.product_category_id = pc.id "
            + "INNER JOIN productmodels m ON p.product_model_id = m.id "
            + "INNER JOIN productbrands pb ON p.product_brand_id = pb.id "
            + "INNER JOIN productunits s ON p.product_unit_id = s.id";
            

        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelBarangMasuk msk = new ModelBarangMasuk();
                ModelDetBarangMasuk det = new ModelDetBarangMasuk();
                ModelDataBarang barang = new ModelDataBarang();
                ModelJenisBarang jenisbarang = new ModelJenisBarang();
                ModelTypeItems model = new ModelTypeItems();
                ModelProductBrands productbrands = new ModelProductBrands();
                ModelSatuan unit = new ModelSatuan();
                
                msk.setIdBarang_Masuk(Integer.valueOf(rs.getInt("id")));
                det.setModelmasuk(msk);
                
                barang.setIdDataBarang(rs.getInt("product_id"));
                barang.setNamaProdukBarang(rs.getString("name"));
                jenisbarang.setNamaJenisBarang(rs.getString("category_name"));
                model.setNameTypeItems(rs.getString("model_name"));
                productbrands.setNameProductBrand(rs.getString("brand_name"));
                unit.setNamaSatuan(rs.getString("unit_name"));
                
                barang.setPrice(rs.getLong("price"));
                det.setJml_masuk(rs.getInt("quantity_incoming"));
                det.setSubtotal_masuk(rs.getLong("subtotal_incoming"));
                
                det.setDatabarang(barang);
                
                
                list.add(det);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelDetBarangMasuk> SearchData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validasiStok(ModelDetBarangMasuk modeldetmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
