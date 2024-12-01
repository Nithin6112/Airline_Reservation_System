-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2023 at 12:50 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ams`
--

-- --------------------------------------------------------

--
-- Table structure for table `airline`
--

CREATE TABLE `airline` (
  `AID` varchar(50) NOT NULL,
  `Name` text NOT NULL,
  `State` text NOT NULL,
  `Cno` int(11) NOT NULL,
  `Cap` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `airline`
--

INSERT INTO `airline` (`AID`, `Name`, `State`, `Cno`, `Cap`) VALUES
('A676', 'ALASHA', 'KARNATAKA', 9887877, 260),
('A87', 'JAZZ', 'KARNATKA', 908988, 325);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `manageflight`
--

CREATE TABLE `manageflight` (
  `flightcode` varchar(30) NOT NULL,
  `source` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL,
  `takeoff` varchar(30) NOT NULL,
  `noofseat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `manageflight`
--

INSERT INTO `manageflight` (`flightcode`, `source`, `destination`, `takeoff`, `noofseat`) VALUES
('f10', 'BANGLORE', 'CHENNAI', '1.00', '40');

-- --------------------------------------------------------

--
-- Table structure for table `managepassenger`
--

CREATE TABLE `managepassenger` (
  `name` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL,
  `passportnumber` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `managepassenger`
--

INSERT INTO `managepassenger` (`name`, `gender`, `nationality`, `passportnumber`, `phone`) VALUES
('RAHIL', 'MALE', 'INDIAN', '677', '76776665');

-- --------------------------------------------------------

--
-- Table structure for table `ticketbooking`
--

CREATE TABLE `ticketbooking` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `flightcode` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `passportnumber` varchar(20) NOT NULL,
  `amount` varchar(20) NOT NULL,
  `nationality` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ticketcancellation`
--

CREATE TABLE `ticketcancellation` (
  `ticketid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airline`
--
ALTER TABLE `airline`
  ADD PRIMARY KEY (`AID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `manageflight`
--
ALTER TABLE `manageflight`
  ADD PRIMARY KEY (`flightcode`);

--
-- Indexes for table `managepassenger`
--
ALTER TABLE `managepassenger`
  ADD PRIMARY KEY (`passportnumber`);

--
-- Indexes for table `ticketcancellation`
--
ALTER TABLE `ticketcancellation`
  ADD PRIMARY KEY (`ticketid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
