-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-07-2021 a las 16:21:17
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pruebapfsb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `id` int(11) NOT NULL COMMENT 'identificador del registro',
  `area` varchar(50) NOT NULL DEFAULT '' COMMENT 'nombre del área'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`id`, `area`) VALUES
(1, 'Administración'),
(2, 'nueva area'),
(3, 'otraa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `basemails`
--

CREATE TABLE `basemails` (
  `idxxxxxx` int(11) NOT NULL,
  `emailxxx` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `basemails`
--

INSERT INTO `basemails` (`idxxxxxx`, `emailxxx`) VALUES
(1, 'jose.jimenez@cidenet.com.co');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctipos`
--

CREATE TABLE `doctipos` (
  `id` int(11) NOT NULL COMMENT 'identificador del registro',
  `tipo` varchar(50) NOT NULL DEFAULT '' COMMENT 'nombre del tipo de documento'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `doctipos`
--

INSERT INTO `doctipos` (`id`, `tipo`) VALUES
(1, 'CC7'),
(2, 'TI7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emails`
--

CREATE TABLE `emails` (
  `idxxxxxx` int(11) NOT NULL,
  `emailxxx` varchar(300) NOT NULL DEFAULT '',
  `consecutivo` int(11) NOT NULL DEFAULT 0,
  `basemailid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `emails`
--

INSERT INTO `emails` (`idxxxxxx`, `emailxxx`, `consecutivo`, `basemailid`) VALUES
(1, 'jose.jimenez@cidenet.com.co', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE `estados` (
  `id` int(11) NOT NULL COMMENT 'identificador del registro',
  `estadoxx` varchar(20) NOT NULL DEFAULT '' COMMENT 'nombre del estado'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`id`, `estadoxx`) VALUES
(1, 'ACTIVO'),
(2, 'INACTIVO4'),
(3, 'dddd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL COMMENT 'identificador del registro',
  `pais` varchar(50) NOT NULL DEFAULT '' COMMENT 'nombre del pais',
  `dominio` varchar(150) NOT NULL DEFAULT '' COMMENT 'dominio de acuerdo al pais'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paises`
--

INSERT INTO `paises` (`id`, `pais`, `dominio`) VALUES
(1, 'COLOMBIA', '@cidenet.com.co'),
(2, 'ESTADOS UNIDOS', '@cidenet.com.us'),
(4, 'nicaraguas', '@cidenet.com.ni');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL COMMENT 'indentificador del registro',
  `primnomb` varchar(20) NOT NULL DEFAULT '' COMMENT 'Primer Nombre',
  `segunomb` varchar(20) NOT NULL DEFAULT '' COMMENT 'Segundo Nombre',
  `primapel` varchar(20) NOT NULL DEFAULT '' COMMENT 'Primer Apellido',
  `seguapel` varchar(20) NOT NULL DEFAULT '' COMMENT 'Segundo Apellido',
  `otronomb` varchar(50) NOT NULL DEFAULT '' COMMENT 'Otros Nombres',
  `paiseid` int(11) NOT NULL COMMENT 'Pais del empleo',
  `doctipoid` int(11) NOT NULL COMMENT 'Tipo de identificación',
  `cedulaxx` varchar(20) NOT NULL DEFAULT '' COMMENT 'Número de Identificación',
  `emailid` int(20) NOT NULL COMMENT 'Correo electrónico',
  `fechingr` date NOT NULL COMMENT 'Fecha de Ingreso',
  `areaid` int(11) NOT NULL COMMENT 'Area para la cual es contratado',
  `estadoid` int(11) NOT NULL COMMENT 'Estado del registro',
  `fhregist` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE current_timestamp() COMMENT 'fecha y hora de registro'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `primnomb`, `segunomb`, `primapel`, `seguapel`, `otronomb`, `paiseid`, `doctipoid`, `cedulaxx`, `emailid`, `fechingr`, `areaid`, `estadoid`, `fhregist`) VALUES
(1, 'JOSE', 'DUMAR', 'JIMENEZ', 'RUIZ', 'NOWEN', 1, 1, '17496705', 1, '2021-07-12', 1, 1, '2021-07-12 14:10:29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `basemails`
--
ALTER TABLE `basemails`
  ADD PRIMARY KEY (`idxxxxxx`),
  ADD UNIQUE KEY `emailxxx` (`emailxxx`);

--
-- Indices de la tabla `doctipos`
--
ALTER TABLE `doctipos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `emails`
--
ALTER TABLE `emails`
  ADD PRIMARY KEY (`idxxxxxx`),
  ADD UNIQUE KEY `emailxxx` (`consecutivo`,`basemailid`) USING BTREE,
  ADD KEY `emailid` (`basemailid`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarios_ibfk_2` (`doctipoid`),
  ADD KEY `usuarios_ibfk_1` (`areaid`),
  ADD KEY `usuarios_ibfk_3` (`estadoid`),
  ADD KEY `paise_id` (`paiseid`),
  ADD KEY `doctipoid` (`doctipoid`,`cedulaxx`),
  ADD KEY `emailid` (`emailid`,`id`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `areas`
--
ALTER TABLE `areas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del registro', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `basemails`
--
ALTER TABLE `basemails`
  MODIFY `idxxxxxx` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `doctipos`
--
ALTER TABLE `doctipos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del registro', AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `emails`
--
ALTER TABLE `emails`
  MODIFY `idxxxxxx` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del registro', AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `paises`
--
ALTER TABLE `paises`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del registro', AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'indentificador del registro', AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `emails`
--
ALTER TABLE `emails`
  ADD CONSTRAINT `emails_ibfk_1` FOREIGN KEY (`basemailid`) REFERENCES `basemails` (`idxxxxxx`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`areaid`) REFERENCES `areas` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `usuarios_ibfk_2` FOREIGN KEY (`doctipoid`) REFERENCES `doctipos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `usuarios_ibfk_3` FOREIGN KEY (`estadoid`) REFERENCES `estados` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `usuarios_ibfk_4` FOREIGN KEY (`paiseid`) REFERENCES `paises` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `usuarios_ibfk_5` FOREIGN KEY (`emailid`) REFERENCES `emails` (`idxxxxxx`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
