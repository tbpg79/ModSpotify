-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2023 a las 14:29:17
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `spotifymod`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generosmusicales`
--

CREATE TABLE `generosmusicales` (
  `Genero` varchar(20) DEFAULT NULL,
  `Titulo` text DEFAULT NULL,
  `Informacion` text DEFAULT NULL,
  `Cantantes` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `generosmusicales`
--

INSERT INTO `generosmusicales` (`Genero`, `Titulo`, `Informacion`, `Cantantes`) VALUES
('Pódcast', 'Pódcast más escuchados: Global', 'Un pódcast (del inglés podcast, a veces también llamado blog de audio) es una serie episódica de archivos multimedia digitales que un usuario puede descargar a un dispositivo personal o bien escuchar en línea. Las aplicaciones de transmisión y los servicios de pódcast ofrecen una forma conveniente de administrar el consumo personal en muchas fuentes de pódcast, dispositivos y aplicaciones de reproducción.', 'Wild Project, Terrores Nocturnos'),
('Novedades', 'Las novedades más escuchadas: Global', 'Las canciones más escuchadas hasta el momento', 'Myke Towers, Eladio Carrion'),
('Rock', 'Rock más escuchado actualmente: ', 'El rock es un amplio género de música popular originado a principios de la década de 1950 en Estados Unidos y que derivaría en un gran rango de diferentes estilos a mediados de los años 1960 y posteriores, particularmente en ese país y Reino Unido. Tiene sus raíces en el rock and roll de los años 50, estilo nacido directamente de géneros como el blues, el rhythm and blues (pertenecientes a la música afroamericana) y el country. ', 'Green Day, U2'),
('Pop', 'Pop más escuchado hasta hoy:', 'La música pop (del inglés pop music, contracción de popular music), también conocida simplemente como pop, es un género de música popular que tuvo su origen a finales de los años 1950 como una derivación del Pop tradicional, en combinación con otros géneros musicales que estaban de moda en aquel momento.', 'Darell, Rauw Alejandro'),
('Hip Hop', 'Hip Hop más escuchado actualmente:', 'La música hip hop, música rap o simplemente rap, es un género de música popular desarrollado en los Estados Unidos por afroestadounidenses y latinoamericanos del centro de la ciudad3​ en el barrio del Bronx de la ciudad de Nueva York en la década de 1970. Consiste en una música rítmica estilizada que comúnmente viene acompañada con la acción de rapear, la cual es un discurso rítmico que se canta. Se desarrolló como parte de la cultura hip hop, definida por cuatro elementos estilísticos clave: MCing/rapear, DJ/scratching (con tocadiscos), break dance y escritura de graffiti.5​6​7​ Otros elementos incluyen muestreos de ritmos o líneas de bajo de discos (o ritmos y sonidos sintetizados) y beatboxing rítmico. El término «música hip hop» es usado como sinónimo del término «música rap»', 'XXX TENTACION, Drake'),
('Gaming', 'Música gaming más escuchada actualmente:', 'Música actualmente para escuchar mientras se juegan videojuegos.', 'Imagine Dragons, Bad Bunny'),
('Amor', 'Amor más escuchado actualmente:', 'Las canciones de amor son expresiones artísticas que transmiten emociones profundas, desde el amor apasionado hasta la añoranza, y han sido una parte fundamental de la música a lo largo de la historia, conectando a las personas a través de sus letras y melodías emotivas.', 'Arrebato, Luis Fonsi'),
('Jazz', 'Jazz más escuchado actualmente:', 'El jazz ​es un género musical nacido a finales del siglo xix en los Estados Unidos, que se expandió de forma global a lo largo del siglo xx. La identidad musical del jazz es compleja y no puede ser delimitada con facilidad.', 'Louis Armstrong, Nina Simone'),
('Relax', 'Música relax más escuchada actualmente:', 'Música utilizada para la relajación.', 'Tom Odell, The Police'),
('Electrónica', 'Electrónica más escuchada actualmente:', 'La música electrónica es aquel tipo de música que emplea instrumentos musicales electrónicos y tecnología musical electrónica para su producción e interpretación. En general, se puede distinguir entre el sonido producido mediante la utilización de medios electromecánicos, de aquel producido mediante tecnología electrónica, que también pueden ser mezclados.', 'Martin Garrix, Zomboy'),
('Para dormir', 'Música para dormir más escuchada:', 'Para dormir, la mejor selección de música.', 'Pine River, Sleepy Sine'),
('Ejercicio', 'Música para hacer ejercicio más escuchada actualmente:', 'Las canciones más valoradas para la realizar ejercicio.', 'Adelina Somerset, Bed of Flowers'),
('Anime', 'Música anime más escuchada:', 'Openings y más...', 'Khai Rap, MegaR'),
('Para estar en casa', 'Música para estar en casa más escuchada actualmente.', 'La música más adecuada para trabajar, meditar, escuchar en familia...', 'Janet Redger, Allysium'),
('Salsa', 'La mejor salsa escuchada actualmente:', 'La salsa es la etiqueta predilecta para referirse al conjunto de géneros musicales bailables resultante de la síntesis del son cubano y otros géneros de la música caribeña como el guaguancó, la guajira, el boogaloo, el mambo, el montuno, la plena, la bomba, el chachachá, la guaracha, la descarga y los géneros estadounidenses como el jazz y el blues. La salsa se consolidó como un éxito comercial por músicos de origen puertorriqueño en la ciudad de Nueva York en la década de 1960, y por la labor de quien fue su principal armador, el dominicano Johnny Pacheco.', 'Marc Anthony, La-33');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
