-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2024 at 06:35 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `incomingproductdetails`
--

CREATE TABLE `incomingproductdetails` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `product_category_id` int(11) DEFAULT NULL,
  `product_model_id` int(11) DEFAULT NULL,
  `product_brand_id` int(11) DEFAULT NULL,
  `product_unit_id` int(11) DEFAULT NULL,
  `quantity_incoming` int(11) NOT NULL,
  `subtotal_incoming` double(10,2) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `incomingproducts`
--

CREATE TABLE `incomingproducts` (
  `id` int(11) NOT NULL,
  `total_incoming` decimal(10,0) NOT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `incomingproducts`
--

INSERT INTO `incomingproducts` (`id`, `total_incoming`, `supplier_id`, `user_id`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, '100000', 3, 1, '2024-05-03 15:49:36', NULL, '2024-05-03 15:49:36', NULL),
(2, '15000', 4, 1, '2024-05-03 16:01:59', NULL, '2024-05-03 16:01:59', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `incomingproducttemporary`
--

CREATE TABLE `incomingproducttemporary` (
  `id` int(11) NOT NULL,
  `product_code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `product_category_id` int(11) DEFAULT NULL,
  `product_model_id` int(11) DEFAULT NULL,
  `product_brand_id` int(11) DEFAULT NULL,
  `product_unit_id` int(11) DEFAULT NULL,
  `price` decimal(10,0) NOT NULL,
  `quantity_incoming` int(11) NOT NULL,
  `subtotal_incoming` double(10,0) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updates_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updates_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `outgoingproducts`
--

CREATE TABLE `outgoingproducts` (
  `id` int(11) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `quantity_outgoing` int(11) DEFAULT 1,
  `waybill` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `productbrands`
--

CREATE TABLE `productbrands` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productbrands`
--

INSERT INTO `productbrands` (`id`, `name`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'Pelco', '2024-04-16 02:53:39', NULL, '2024-04-16 02:53:39', NULL),
(2, 'Bosch', '2024-04-16 02:53:53', NULL, '2024-04-16 02:53:53', NULL),
(3, 'Honeywell', '2024-04-16 02:54:03', NULL, '2024-04-16 02:54:03', NULL),
(4, 'Entrypass', '2024-04-16 02:54:12', NULL, '2024-04-16 02:54:12', NULL),
(5, 'Galagher', '2024-04-16 02:54:17', NULL, '2024-04-16 02:54:17', NULL),
(6, 'Schneider', '2024-04-16 02:54:25', NULL, '2024-04-16 02:54:25', NULL),
(7, 'Supreme', '2024-04-16 02:54:29', NULL, '2024-04-16 02:54:29', NULL),
(8, 'Belden', '2024-04-16 02:54:44', NULL, '2024-04-16 02:54:44', NULL),
(9, 'Cisco', '2024-04-16 02:55:02', NULL, '2024-04-16 02:55:02', NULL),
(10, 'HP', '2024-04-16 02:55:08', NULL, '2024-04-16 02:55:08', NULL),
(11, 'Eterna', '2024-04-16 02:55:30', NULL, '2024-04-16 02:55:30', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `productcategories`
--

CREATE TABLE `productcategories` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productcategories`
--

INSERT INTO `productcategories` (`id`, `name`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'Fixed IP Cameras', '2024-04-06 17:08:55', NULL, '2024-04-06 17:08:55', NULL),
(2, 'Pan, TIlt, Zoom Cameras', '2024-04-06 15:50:25', NULL, '2024-04-06 15:50:25', NULL),
(3, 'Panoramic IP Cameras', '2024-04-06 15:50:32', NULL, '2024-04-06 15:50:32', NULL),
(4, 'Accessories', '2024-04-06 15:50:44', NULL, '2024-04-06 15:50:44', NULL),
(5, 'Video Management Software', '2024-04-06 15:50:55', NULL, '2024-04-06 15:50:55', NULL),
(6, 'Video Analytics', '2024-04-06 15:51:02', NULL, '2024-04-06 15:51:02', NULL),
(10, 'Speciality IP Cameras', '2024-04-06 23:12:59', NULL, '2024-04-06 23:12:59', NULL),
(11, 'Technology Integrations', '2024-04-06 23:14:49', NULL, '2024-04-06 23:14:49', NULL),
(13, 'Fixed Analog Cameras', '2024-04-21 06:17:19', NULL, '2024-04-21 06:17:19', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `productmodels`
--

CREATE TABLE `productmodels` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productmodels`
--

INSERT INTO `productmodels` (`id`, `name`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'FD1-F4-4X', '2024-04-06 22:19:23', NULL, '2024-04-06 22:19:23', NULL),
(2, 'BU4-IRF4-4X', '2024-04-06 22:19:37', NULL, '2024-04-06 22:19:37', NULL),
(3, 'DD423-X', '2024-04-06 22:19:46', NULL, '2024-04-06 22:19:46', NULL),
(4, 'IBP131-1ER', '2024-04-06 22:24:25', NULL, '2024-04-06 22:24:25', NULL),
(5, 'IBP231-1ER', '2024-04-06 22:24:39', NULL, '2024-04-06 22:24:39', NULL),
(6, 'IBP235-1ER', '2024-04-06 22:24:57', NULL, '2024-04-06 22:24:57', NULL),
(7, 'IBP335-1ER', '2024-04-06 22:25:10', NULL, '2024-04-06 22:25:10', NULL),
(8, 'IBP532-1ER', '2024-04-06 22:25:23', NULL, '2024-04-06 22:25:23', NULL),
(9, 'IMP131-1ERS', '2024-04-06 22:26:02', NULL, '2024-04-06 22:26:02', NULL),
(10, 'IMP131-1IRS', '2024-04-06 22:26:22', NULL, '2024-04-06 22:26:22', NULL),
(11, 'IMP331-1ES', '2024-04-06 22:26:47', NULL, '2024-04-06 22:26:47', NULL),
(12, 'IMP231-1ES', '2024-04-06 22:27:10', NULL, '2024-04-06 22:27:10', NULL),
(13, 'IMP231-1IRS', '2024-04-06 22:27:31', NULL, '2024-04-06 22:27:31', NULL),
(14, 'IMP331-1IRS', '2024-04-06 22:28:01', NULL, '2024-04-06 22:28:01', NULL),
(15, 'IMP531-1IS', '2024-04-06 22:28:18', NULL, '2024-04-06 22:28:18', NULL),
(16, 'IMP531-1ERS', '2024-04-06 22:28:44', NULL, '2024-04-06 22:28:44', NULL),
(17, 'IMM12018-1I', '2024-04-06 22:29:39', NULL, '2024-04-06 22:29:39', NULL),
(18, 'IMM12018-B1I', '2024-04-06 22:29:59', NULL, '2024-04-06 22:29:59', NULL),
(19, 'IMM12036-1EP', '2024-04-06 22:30:19', NULL, '2024-04-06 22:30:19', NULL),
(20, 'IMM12036-B1P', '2024-04-06 22:30:32', NULL, '2024-04-06 22:30:32', NULL),
(21, 'IMM12027-1ES', '2024-04-06 22:31:01', NULL, '2024-04-06 22:31:01', NULL),
(22, 'TI2535', '2024-04-06 22:32:31', NULL, '2024-04-06 22:32:31', NULL),
(23, 'T12535-X', '2024-04-06 22:32:42', NULL, '2024-04-06 22:32:42', NULL),
(24, 'TI2550-X', '2024-04-06 22:32:57', NULL, '2024-04-06 22:32:57', NULL),
(25, 'TI2550-X-1', '2024-04-06 22:33:07', NULL, '2024-04-06 22:33:07', NULL),
(26, 'TI2535-X-1', '2024-04-06 22:33:34', NULL, '2024-04-06 22:33:34', NULL),
(27, 'IP110-DWV9', '2024-04-06 22:35:18', NULL, '2024-04-06 22:35:18', NULL),
(28, 'IP110-CWV9', '2024-04-06 22:35:31', NULL, '2024-04-06 22:35:31', NULL),
(29, 'IP111-CHV9', '2024-04-06 22:35:41', NULL, '2024-04-06 22:35:41', NULL),
(30, 'IP111-CWV22', '2024-04-06 22:35:53', NULL, '2024-04-06 22:35:53', NULL),
(31, 'IP111-CHV22X', '2024-04-06 22:36:04', NULL, '2024-04-06 22:36:04', NULL),
(32, 'IP110-DNV9', '2024-04-06 22:36:49', NULL, '2024-04-06 22:36:49', NULL),
(33, 'IP110-DNV22X', '2024-04-06 22:37:06', NULL, '2024-04-06 22:37:06', NULL),
(34, 'IP111-DNV22', '2024-04-06 22:37:19', NULL, '2024-04-06 22:37:19', NULL),
(35, 'IL10-BA', '2024-04-06 22:38:56', NULL, '2024-04-06 22:38:56', NULL),
(36, 'IL10-DP', '2024-04-06 22:39:06', NULL, '2024-04-06 22:39:06', NULL),
(37, 'IL-10DA', '2024-04-06 22:39:16', NULL, '2024-04-06 22:39:16', NULL),
(38, 'ES3014TI-2N', '2024-04-06 22:39:56', NULL, '2024-04-06 22:39:56', NULL),
(39, 'ES3050TI-2N', '2024-04-06 22:40:09', NULL, '2024-04-06 22:40:09', NULL),
(40, 'ES3050TI-2W-X-1', '2024-04-06 22:40:24', NULL, '2024-04-06 22:40:24', NULL),
(41, 'ES3050TI-5W-X-1', '2024-04-06 22:40:41', NULL, '2024-04-06 22:40:41', NULL),
(42, 'ES3050TI-2W-1', '2024-04-06 22:41:01', NULL, '2024-04-06 22:41:01', NULL),
(43, 'ES3014TI-2W', '2024-04-06 22:41:15', NULL, '2024-04-06 22:41:15', NULL),
(44, 'P2820-ESR', '2024-04-06 22:48:22', NULL, '2024-04-06 22:48:22', NULL),
(45, 'P2230L-ESR', '2024-04-06 22:48:36', NULL, '2024-04-06 22:48:36', NULL),
(46, 'FD1-IRV9-4X', '2024-04-06 22:51:53', NULL, '2024-04-06 22:51:53', NULL),
(47, 'IFV222-1ERS', '2024-04-06 22:55:24', NULL, '2024-04-06 22:55:24', NULL),
(48, 'IBV529-1ER', '2024-04-06 22:55:41', NULL, '2024-04-06 22:55:41', NULL),
(49, 'IMV229-1ERS', '2024-04-06 22:56:00', NULL, '2024-04-06 22:56:00', NULL),
(50, 'IMV529-1ERS', '2024-04-06 22:56:10', NULL, '2024-04-06 22:56:10', NULL),
(51, 'SRXP4-2V10-IMD', '2024-04-06 22:56:41', NULL, '2024-04-06 22:56:41', NULL),
(52, 'SRX4P4-5V10-IMD-IR', '2024-04-06 22:56:59', NULL, '2024-04-06 22:56:59', NULL),
(53, 'SRXP4-3V10-IMD-IR', '2024-04-06 22:57:20', NULL, '2024-04-06 22:57:20', NULL),
(54, 'SRX4P4-2V10-EBT-IR', '2024-04-06 22:57:43', NULL, '2024-04-06 22:57:43', NULL),
(55, 'SRXP4-5V10-EMD-IR', '2024-04-06 22:57:59', NULL, '2024-04-06 22:57:59', NULL),
(56, 'SRXP4-2V10-EMD', '2024-04-06 22:58:16', NULL, '2024-04-06 22:58:16', NULL),
(57, 'IBP331-1ER', '2024-04-06 22:59:08', NULL, '2024-04-06 22:59:08', NULL),
(58, 'IMP331-1ERS', '2024-04-06 22:59:37', NULL, '2024-04-06 22:59:37', NULL),
(59, 'IBE238-1ER', '2024-04-06 23:00:55', NULL, '2024-04-06 23:00:55', NULL),
(60, 'IBE332-1ER', '2024-04-06 23:01:10', NULL, '2024-04-06 23:01:10', NULL),
(61, 'IBE832-1ER', '2024-04-06 23:01:21', NULL, '2024-04-06 23:01:21', NULL),
(62, 'IME238-1ERS', '2024-04-06 23:01:43', NULL, '2024-04-06 23:01:43', NULL),
(63, 'IME839-1ERS', '2024-04-06 23:01:53', NULL, '2024-04-06 23:01:53', NULL),
(64, 'IME832-1ERS', '2024-04-06 23:02:04', NULL, '2024-04-06 23:02:04', NULL),
(65, 'IME539-1IRS', '2024-04-06 23:02:15', NULL, '2024-04-06 23:02:15', NULL),
(66, 'P2230L-EW0', '2024-04-06 23:02:58', NULL, '2024-04-06 23:02:58', NULL),
(67, 'P2330L-EW1', '2024-04-06 23:03:08', NULL, '2024-04-06 23:03:08', NULL),
(68, 'P2230L-FW0', '2024-04-06 23:03:21', NULL, '2024-04-06 23:03:21', NULL),
(69, 'P2230L-FW1', '2024-04-06 23:03:32', NULL, '2024-04-06 23:03:32', NULL),
(70, 'S7818L-FW0', '2024-04-06 23:04:26', NULL, '2024-04-06 23:04:26', NULL),
(71, 'S7818L-YB1', '2024-04-06 23:04:43', NULL, '2024-04-06 23:04:43', NULL),
(72, 'S7818L-EW0', '2024-04-06 23:04:55', NULL, '2024-04-06 23:04:55', NULL),
(73, 'S7820L-PW', '2024-04-06 23:05:14', NULL, '2024-04-06 23:05:14', NULL),
(74, 'S7240L-PW', '2024-04-06 23:05:34', NULL, '2024-04-06 23:05:34', NULL),
(75, 'IMD1-INCLD1', '2024-04-06 23:06:32', NULL, '2024-04-06 23:06:32', NULL),
(76, 'SMLE1-9V5-3H', '2024-04-06 23:06:52', NULL, '2024-04-06 23:06:52', NULL),
(77, 'SMLE1-12V5-4H', '2024-04-06 23:07:05', NULL, '2024-04-06 23:07:05', NULL),
(78, 'SMLE1-32V5-4H', '2024-04-06 23:07:23', NULL, '2024-04-06 23:07:23', NULL),
(79, 'VX-WKST', '2024-04-06 23:08:30', NULL, '2024-04-06 23:08:30', NULL),
(80, 'VX-RKWKST', '2024-04-06 23:09:10', NULL, '2024-04-06 23:09:10', NULL),
(81, 'VX-RKWKS8T', '2024-04-06 23:09:30', NULL, '2024-04-06 23:09:30', NULL),
(82, 'VX-A5-SDD', '2024-04-06 23:09:47', NULL, '2024-04-06 23:09:47', NULL),
(83, 'VXCMG3-NSVR', '2024-04-06 23:10:04', NULL, '2024-04-06 23:10:04', NULL),
(84, 'SRXP4-2V10-EBT-IR', '2024-04-18 08:24:35', NULL, '2024-04-18 08:24:35', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `product_code` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `product_category_id` int(11) DEFAULT NULL,
  `product_model_id` int(11) DEFAULT NULL,
  `product_brand_id` int(11) DEFAULT NULL,
  `product_unit_id` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT 0,
  `price` decimal(10,0) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `product_code`, `name`, `product_category_id`, `product_model_id`, `product_brand_id`, `product_unit_id`, `stock`, `price`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'CCTV-DKA-IP-001', 'Sarix Professional 4 Dome Indoor', 1, 51, 1, 1, 5, '12000000', '2024-04-18 05:23:46', NULL, '2024-04-18 05:23:46', NULL),
(2, 'CCTV-DKA-IP-002', 'Sarix Professional 4 Dome Indoor', 1, 53, 1, 1, 12, '14000000', '2024-04-18 05:27:19', NULL, '2024-04-18 05:27:19', NULL),
(3, 'CCTV-DKA-IP-003', 'Sarix Professional 4 Dome Outdoor', 1, 56, 1, 1, 20, '13500000', '2024-04-18 05:32:14', NULL, '2024-04-18 05:32:14', NULL),
(4, 'CCTV-DKA-IP-004', 'Sarix Professional 4 Bullet Outdoor', 1, 84, 1, 1, 4, '17400000', '2024-04-18 08:27:03', NULL, '2024-04-18 08:27:03', NULL),
(5, 'CCTV-DKA-IP-005', 'Spectra Professional 2 Outdoor', 2, 68, 1, 1, 4, '85000000', '2024-04-18 09:01:32', NULL, '2024-04-18 09:01:32', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `productserialnumbers`
--

CREATE TABLE `productserialnumbers` (
  `id` int(11) NOT NULL,
  `serial_number` varchar(255) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `productunits`
--

CREATE TABLE `productunits` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `productunits`
--

INSERT INTO `productunits` (`id`, `name`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'Unit', '2024-04-07 14:29:24', NULL, '2024-04-07 14:29:24', NULL),
(2, 'Meter', '2024-04-07 14:29:31', NULL, '2024-04-07 14:29:31', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suppliers`
--

INSERT INTO `suppliers` (`id`, `name`, `address`, `phone`, `email`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(2, 'PT. Trikomindo Kharis Utama', 'Ruko Permata Ancol Blok G No.16, Jakarta Utara, DKI Jakarta', '02122644744', 'marketing@trikomkharisma.com', '2024-04-07 13:48:34', NULL, '2024-04-07 13:48:34', NULL),
(3, 'PT Epsilon Global', 'City Square Business Park Blok B No. 8 Jl. Peta Selatan, Kalideres, Jakarta Barat', '021 2252 0543', 'marketing@epsilon.co.id', '2024-04-07 13:58:16', NULL, '2024-04-07 13:58:16', NULL),
(4, 'PT. Harrisma Informatika Jaya', 'Komp. Perkantoran Taman Kebon JerukBlok A4 no.6\nJakarta ', '021 585 7413', 'info@harrisma.com', '2024-04-07 14:00:16', NULL, '2024-04-07 14:00:16', NULL),
(5, 'PT. Brikom Entripas Indonesia', 'Jl. Griya Utama, Komplek Puri Mutiara Blok BF No. 17, RT.1/RW.20, Sunter Agung, Tj. Priok, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta', '02129376098', 'indonesia@entrypass.net', '2024-04-07 14:01:21', NULL, '2024-04-07 14:01:21', NULL),
(6, 'PT Armindo Mandiri', 'Jl. Agung Indah 3 Blok K- 1 Kavling Nomor 52 Kel. sunter Kec. Tanjung Priok Kota Adm Jakarta Utara Provinsi DKI', ' 0216301510', 'eproc.lkpp@armindomandiri.com', '2024-04-07 14:05:56', NULL, '2024-04-07 14:05:56', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` enum('admin') DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_by` varchar(255) DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_by` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `username`, `password`, `role`, `created_at`, `created_by`, `updated_at`, `updated_by`) VALUES
(1, 'admin', 'admin@gmail.com', 'admin', 'admin', 'admin', '2024-04-21 15:23:25', NULL, '2024-04-21 15:23:25', NULL),
(3, 'M Ridhwan Rafif', 'mridhwanrafif27@gmail.com', 'rdhn27', 'Suhandi12!', 'admin', '2024-04-25 12:26:01', NULL, '2024-04-25 12:26:01', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `phone` (`phone`);

--
-- Indexes for table `incomingproductdetails`
--
ALTER TABLE `incomingproductdetails`
  ADD KEY `incomingproductdetails_ibfk_1` (`product_id`),
  ADD KEY `incomingproductdetails_ibfk_2` (`product_category_id`),
  ADD KEY `incomingproductdetails_ibfk_3` (`product_model_id`),
  ADD KEY `incomingproductdetails_ibfk_4` (`product_brand_id`),
  ADD KEY `incomingproductdetails_ibfk_5` (`product_unit_id`);

--
-- Indexes for table `incomingproducts`
--
ALTER TABLE `incomingproducts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `supplier_id` (`supplier_id`) USING BTREE,
  ADD KEY `user_id` (`user_id`) USING BTREE;

--
-- Indexes for table `incomingproducttemporary`
--
ALTER TABLE `incomingproducttemporary`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `product_category_id` (`product_category_id`),
  ADD KEY `product_model_id` (`product_model_id`),
  ADD KEY `product_brand_id` (`product_brand_id`),
  ADD KEY `product_unit_id` (`product_unit_id`);

--
-- Indexes for table `outgoingproducts`
--
ALTER TABLE `outgoingproducts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `productbrands`
--
ALTER TABLE `productbrands`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `productcategories`
--
ALTER TABLE `productcategories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `productmodels`
--
ALTER TABLE `productmodels`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `product_code` (`product_code`),
  ADD KEY `product_category_id` (`product_category_id`),
  ADD KEY `product_model_id` (`product_model_id`),
  ADD KEY `product_brand_id` (`product_brand_id`),
  ADD KEY `product_unit_id` (`product_unit_id`);

--
-- Indexes for table `productserialnumbers`
--
ALTER TABLE `productserialnumbers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `productunits`
--
ALTER TABLE `productunits`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `phone` (`phone`),
  ADD KEY `name` (`name`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `incomingproducts`
--
ALTER TABLE `incomingproducts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `incomingproducttemporary`
--
ALTER TABLE `incomingproducttemporary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `outgoingproducts`
--
ALTER TABLE `outgoingproducts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `productbrands`
--
ALTER TABLE `productbrands`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `productcategories`
--
ALTER TABLE `productcategories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `productmodels`
--
ALTER TABLE `productmodels`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `productserialnumbers`
--
ALTER TABLE `productserialnumbers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `productunits`
--
ALTER TABLE `productunits`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `incomingproductdetails`
--
ALTER TABLE `incomingproductdetails`
  ADD CONSTRAINT `incomingproductdetails_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `incomingproductdetails_ibfk_2` FOREIGN KEY (`product_category_id`) REFERENCES `productcategories` (`id`),
  ADD CONSTRAINT `incomingproductdetails_ibfk_3` FOREIGN KEY (`product_model_id`) REFERENCES `productmodels` (`id`),
  ADD CONSTRAINT `incomingproductdetails_ibfk_4` FOREIGN KEY (`product_brand_id`) REFERENCES `productbrands` (`id`),
  ADD CONSTRAINT `incomingproductdetails_ibfk_5` FOREIGN KEY (`product_unit_id`) REFERENCES `productunits` (`id`);

--
-- Constraints for table `incomingproducts`
--
ALTER TABLE `incomingproducts`
  ADD CONSTRAINT `incomingproducts_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`id`),
  ADD CONSTRAINT `incomingproducts_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `incomingproducttemporary`
--
ALTER TABLE `incomingproducttemporary`
  ADD CONSTRAINT `incomingproducttemporary_ibfk_1` FOREIGN KEY (`id`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `incomingproducttemporary_ibfk_2` FOREIGN KEY (`product_category_id`) REFERENCES `productcategories` (`id`),
  ADD CONSTRAINT `incomingproducttemporary_ibfk_3` FOREIGN KEY (`product_model_id`) REFERENCES `productmodels` (`id`),
  ADD CONSTRAINT `incomingproducttemporary_ibfk_4` FOREIGN KEY (`product_brand_id`) REFERENCES `productbrands` (`id`),
  ADD CONSTRAINT `incomingproducttemporary_ibfk_5` FOREIGN KEY (`product_unit_id`) REFERENCES `productunits` (`id`);

--
-- Constraints for table `outgoingproducts`
--
ALTER TABLE `outgoingproducts`
  ADD CONSTRAINT `outgoingproducts_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `outgoingproducts_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`product_model_id`) REFERENCES `productmodels` (`id`),
  ADD CONSTRAINT `products_ibfk_2` FOREIGN KEY (`product_unit_id`) REFERENCES `productunits` (`id`),
  ADD CONSTRAINT `products_ibfk_3` FOREIGN KEY (`product_category_id`) REFERENCES `productcategories` (`id`),
  ADD CONSTRAINT `products_ibfk_4` FOREIGN KEY (`product_brand_id`) REFERENCES `productbrands` (`id`);

--
-- Constraints for table `productserialnumbers`
--
ALTER TABLE `productserialnumbers`
  ADD CONSTRAINT `productserialnumbers_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
