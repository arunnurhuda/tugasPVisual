-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2021 at 12:15 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `arunanet`
--
CREATE DATABASE IF NOT EXISTS `arunanet` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `arunanet`;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user` varchar(20) NOT NULL,
  `pass` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user`, `pass`) VALUES
('admin', 'admin'),
('amin', 'amin');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` varchar(10) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `no_wa` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tgl_pasang` varchar(10) NOT NULL,
  `speed` varchar(10) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `nama`, `no_wa`, `alamat`, `tgl_pasang`, `speed`, `harga`) VALUES
('IN001', 'BUDI', '08', 'Jalan Sepakat IV', '01/01/2021', '7', '100000'),
('IN002', 'AIDA', '08', 'Jalan Sepakat IV', '01/01/2021', '7', '100000'),
('IN003', 'GERARD', '08', 'Jalan Sepakat IV', '02/02/2021', '7', '50000'),
('IN004', 'DIANA', '08', 'Jalan Sepakat IV', '02/02/2021', '7', '100000'),
('IN005', 'MPO ETY', '08', 'Jalan Sepakat IV', '02/02/2021', '7', '100000'),
('IN006', 'MARDANI', '08', 'Jalan Sepakat IV', '02/03/2021', '7', '100000'),
('IN007', 'IHLAM', '08', 'Jalan Sepakat IV', '04/02/2021', '7', '100000'),
('IN008', 'ARDI/GODEL', '08', 'Jalan Sepakat IV', '04/02/2021', '7', '100000'),
('IN009', 'POS RT08', '08', 'Jalan Sepakat IV', '05/06/2021', '7', '100000'),
('IN010', 'WARUNG HENDRA', '08', 'Jalan Sepakat IV', '05/06/2021', '7', '100000'),
('IN011', 'NIMIH', '08', 'Jalan Sepakat IV', '08/05/2021', '7', '100000'),
('IN012', 'JIDUN', '08', 'Jalan Sepakat IV', '08/04/2021', '7', '100000'),
('IN013', 'NOVITA', '08', 'Jalan Sepakat IV', '10/02/2021', '7', '100000'),
('IN014', 'KETUA RT08', '08', 'Jalan Sepakat IV', '10/02/2021', '7', '100000'),
('IN015', 'MONIC/OYANG', '08', 'Jalan Sepakat IV', '10/02/2021', '7', '100000'),
('IN016', 'CLAUDIA', '08', 'Jalan Sepakat IV', '11/07/2021', '7', '100000'),
('IN017', 'DZIKRA', '08', 'Jalan Sepakat IV', '12/01/2021', '7', '100000'),
('IN018', 'BILLY', '08', 'Jalan Sepakat IV', '12/01/2021', '7', '100000'),
('IN019', 'YUDHI BEJO', '08', 'Jalan Sepakat IV', '12/01/2021', '7', '100000'),
('IN020', 'HAWA', '08', 'Jalan Sepakat IV', '16/02/2021', '7', '100000'),
('IN021', 'PO ANI / AMEL', '08', 'Jalan Sepakat IV', '19/06/2021', '7', '100000'),
('IN022', 'GILANG', '08', 'Jalan Sepakat IV', '19/06/2021', '7', '100000'),
('IN023', 'AMEL NASGOR', '08', 'Jalan Sepakat IV', '19/06/2021', '7', '100000'),
('IN024', 'PO ROS', '08', 'Jalan Sepakat IV', '19/06/2021', '7', '100000'),
('IN025', 'ANAS', '08', 'Jalan Sepakat IV', '25/03/2021', '7', '100000'),
('IN026', 'BU HERA', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN027', 'KARTINI', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN028', 'IJAL / ENDANG', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN029', 'DESI', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN030', 'PUPUT / PAK NCING', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN031', 'BU YULIANI', '08', 'Jalan Sepakat IV', '26/06/2021', '7', '100000'),
('IN032', 'REFA / ARUL', '08', 'Jalan Sepakat IV', '29/05/2021', '7', '100000'),
('IN033', 'DEWI', '08', 'Jalan Sepakat IV', '29/05/2021', '7', '100000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`user`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
