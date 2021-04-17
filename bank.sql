-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2021 at 11:52 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank_user`
--

CREATE TABLE `bank_user` (
  `id` int(11) NOT NULL,
  `user_name` text DEFAULT NULL,
  `user_email` text DEFAULT NULL,
  `user_pasword` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bank_user`
--

INSERT INTO `bank_user` (`id`, `user_name`, `user_email`, `user_pasword`) VALUES
(1, 'Ali', 'ali.com', '1212'),
(2, 'hajira', '19sw125', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `create_account`
--

CREATE TABLE `create_account` (
  `user_id` int(11) NOT NULL,
  `first_name` text DEFAULT NULL,
  `last_name` text DEFAULT NULL,
  `cnic_no` text DEFAULT NULL,
  `father_name` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `mobile` text DEFAULT NULL,
  `address` text DEFAULT NULL,
  `account_type` text DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `account_no` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `create_account`
--

INSERT INTO `create_account` (`user_id`, `first_name`, `last_name`, `cnic_no`, `father_name`, `email`, `mobile`, `address`, `account_type`, `amount`, `account_no`) VALUES
(1, 'Ali', 'Ahmed', '09876', 'Abu', '@gmai.com', '547457', 'hyd', 'saving', 500, 'CS000'),
(2, 'hajira', 'fatima', '0315', 'raees', 'hajirafatima11@', '032574786', 'yhrhdfgjghjtg', 'current', 45000, 'CS001'),
(3, 'muskan', 'fatima', '23456', 'syedm', '6554ui', '876457', 'hyd', 'current', NULL, 'CS002'),
(4, 'Ali', 'ali', '7654', 'dsf', '@gmail.com', '54', 'hyd', 'saving', 500, 'CS003'),
(5, 'jh', 'hjf', '987', 'ah', '@ali', '98', 'hyd', 'saving', NULL, 'CS004'),
(6, 'meesam', 'rizvi', '8u5565', 'muhommad', 'hswkyhgotrj', '898664677', 'karfhob', 'current', NULL, 'CS005'),
(7, 'gdfs', 'fgfdg', '434', 'sdf', 'dds', '345', 'hyd', 'saving', 50000, 'CS006');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cust_id` int(11) NOT NULL,
  `cust_fname` text DEFAULT NULL,
  `cust_lname` text DEFAULT NULL,
  `cnic` text DEFAULT NULL,
  `father_name` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `mobile` text DEFAULT NULL,
  `address` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `id` int(11) NOT NULL,
  `account_type` text DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `get_date` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `account_type`, `amount`, `get_date`) VALUES
(1, 'CS000', 1000, '22/03/2021 17:44:14'),
(2, 'CS001', 5000, '22/03/2021 17:51:32'),
(3, 'cs001', 52000, '22/03/2021 19:20:33'),
(4, 'CS003', 500, '29/03/2021 17:54:13'),
(5, 'CS000', 1500, '05/04/2021 18:07:38'),
(6, 'CS006', 50000, '12/04/2021 17:02:12');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

CREATE TABLE `withdraw` (
  `id` int(11) NOT NULL,
  `account_type` text DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `get_date` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`id`, `account_type`, `amount`, `get_date`) VALUES
(1, 'CS000 ', 500, '22/03/2021 17:44:32'),
(2, 'CS001 ', 2000, '22/03/2021 17:52:42'),
(3, 'cs001 ', 45000, '22/03/2021 19:21:05'),
(4, 'CS000 ', 500, '05/04/2021 18:07:52');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank_user`
--
ALTER TABLE `bank_user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `create_account`
--
ALTER TABLE `create_account`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cust_id`);

--
-- Indexes for table `deposit`
--
ALTER TABLE `deposit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank_user`
--
ALTER TABLE `bank_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `create_account`
--
ALTER TABLE `create_account`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cust_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
