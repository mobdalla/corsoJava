-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Giu 27, 2024 alle 17:39
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `countries`
--

CREATE TABLE `countries` (
  `alpha2code` varchar(255) NOT NULL,
  `capital` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `region` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `countries`
--

INSERT INTO `countries` (`alpha2code`, `capital`, `name`, `region`) VALUES
('AE', 'Abu Dhabi', 'United Arab Emirates', 'Asia'),
('AF', 'Kabul', 'Afghanistan', 'Asia'),
('AL', 'Tirana', 'Albania', 'Europe'),
('AM', 'Yerevan', 'Armenia', 'Asia'),
('AO', 'Luanda', 'Angola', 'Africa'),
('AR', 'Buenos Aires', 'Argentina', 'Americas'),
('AT', 'Vienna', 'Austria', 'Europe'),
('AU', 'Canberra', 'Australia', 'Oceania'),
('AZ', 'Baku', 'Azerbaijan', 'Asia'),
('BA', 'Sarajevo', 'Bosnia and Herzegovina', 'Europe'),
('BD', 'Dhaka', 'Bangladesh', 'Asia'),
('BE', 'Brussels', 'Belgium', 'Europe'),
('BF', 'Ouagadougou', 'Burkina Faso', 'Africa'),
('BG', 'Sofia', 'Bulgaria', 'Europe'),
('BH', 'Manama', 'Bahrain', 'Asia'),
('BI', 'Gitega', 'Burundi', 'Africa'),
('BJ', 'Porto-Novo', 'Benin', 'Africa'),
('BO', 'Sucre', 'Bolivia (Plurinational State of)', 'Americas'),
('BR', 'Bras�lia', 'Brazil', 'Americas'),
('BT', 'Thimphu', 'Bhutan', 'Asia'),
('BW', 'Gaborone', 'Botswana', 'Africa'),
('BY', 'Minsk', 'Belarus', 'Europe'),
('BZ', 'Belmopan', 'Belize', 'Americas'),
('CA', 'Ottawa', 'Canada', 'Americas'),
('CF', 'Bangui', 'Central African Republic', 'Africa'),
('CG', 'Brazzaville', 'Congo', 'Africa'),
('CH', 'Bern', 'Switzerland', 'Europe'),
('CI', 'Yamoussoukro', 'C�te d\'Ivoire', 'Africa'),
('CL', 'Santiago', 'Chile', 'Americas'),
('CM', 'Yaound�', 'Cameroon', 'Africa'),
('CN', 'Beijing', 'China', 'Asia'),
('CO', 'Bogot�', 'Colombia', 'Americas'),
('CR', 'San Jos�', 'Costa Rica', 'Americas'),
('CU', 'Havana', 'Cuba', 'Americas'),
('CV', 'Praia', 'Cabo Verde', 'Africa'),
('CY', 'Nicosia', 'Cyprus', 'Europe'),
('CZ', 'Prague', 'Czech Republic', 'Europe'),
('DE', 'Berlin', 'Germany', 'Europe'),
('DJ', 'Djibouti', 'Djibouti', 'Africa'),
('DK', 'Copenhagen', 'Denmark', 'Europe'),
('DO', 'Santo Domingo', 'Dominican Republic', 'Americas'),
('DZ', 'Algiers', 'Algeria', 'Africa'),
('EC', 'Quito', 'Ecuador', 'Americas'),
('EE', 'Tallinn', 'Estonia', 'Europe'),
('EG', 'Cairo', 'Egypt', 'Africa'),
('ES', 'Madrid', 'Spain', 'Europe'),
('ET', 'Addis Ababa', 'Ethiopia', 'Africa'),
('FI', 'Helsinki', 'Finland', 'Europe'),
('FJ', 'Suva', 'Fiji', 'Oceania'),
('FR', 'Paris', 'France', 'Europe'),
('GA', 'Libreville', 'Gabon', 'Africa'),
('GE', 'Tbilisi', 'Georgia', 'Asia'),
('GH', 'Accra', 'Ghana', 'Africa'),
('GN', 'Conakry', 'Guinea', 'Africa'),
('GQ', 'Malabo', 'Equatorial Guinea', 'Africa'),
('GR', 'Athens', 'Greece', 'Europe'),
('GT', 'Guatemala City', 'Guatemala', 'Americas'),
('GW', 'Bissau', 'Guinea-Bissau', 'Africa'),
('GY', 'Georgetown', 'Guyana', 'Americas'),
('HK', 'City of Victoria', 'Hong Kong', 'Asia'),
('HN', 'Tegucigalpa', 'Honduras', 'Americas'),
('HR', 'Zagreb', 'Croatia', 'Europe'),
('HT', 'Port-au-Prince', 'Haiti', 'Americas'),
('HU', 'Budapest', 'Hungary', 'Europe'),
('ID', 'Jakarta', 'Indonesia', 'Asia'),
('IE', 'Dublin', 'Ireland', 'Europe'),
('IL', 'Jerusalem', 'Israel', 'Asia'),
('IN', 'New Delhi', 'India', 'Asia'),
('IQ', 'Baghdad', 'Iraq', 'Asia'),
('IR', 'Tehran', 'Iran (Islamic Republic of)', 'Asia'),
('IS', 'Reykjav�k', 'Iceland', 'Europe'),
('IT', 'Rome', 'Italy', 'Europe'),
('JM', 'Kingston', 'Jamaica', 'Americas'),
('JO', 'Amman', 'Jordan', 'Asia'),
('JP', 'Tokyo', 'Japan', 'Asia'),
('KE', 'Nairobi', 'Kenya', 'Africa'),
('KG', 'Bishkek', 'Kyrgyzstan', 'Asia'),
('KH', 'Phnom Penh', 'Cambodia', 'Asia'),
('KM', 'Moroni', 'Comoros', 'Africa'),
('KP', 'Pyongyang', 'Korea (Democratic People\'s Republic of)', 'Asia'),
('KR', 'Seoul', 'Korea (Republic of)', 'Asia'),
('KW', 'Kuwait City', 'Kuwait', 'Asia'),
('KZ', 'Nur-Sultan', 'Kazakhstan', 'Asia'),
('LA', 'Vientiane', 'Lao People\'s Democratic Republic', 'Asia'),
('LB', 'Beirut', 'Lebanon', 'Asia'),
('LC', 'Castries', 'Saint Lucia', 'Americas'),
('LK', 'Sri Jayawardenepura Kotte', 'Sri Lanka', 'Asia'),
('LR', 'Monrovia', 'Liberia', 'Africa'),
('LS', 'Maseru', 'Lesotho', 'Africa'),
('LT', 'Vilnius', 'Lithuania', 'Europe'),
('LU', 'Luxembourg', 'Luxembourg', 'Europe'),
('LV', 'Riga', 'Latvia', 'Europe'),
('LY', 'Tripoli', 'Libya', 'Africa'),
('MA', 'Rabat', 'Morocco', 'Africa'),
('MD', 'Chisinau', 'Moldova (Republic of)', 'Europe'),
('ME', 'Podgorica', 'Montenegro', 'Europe'),
('MG', 'Antananarivo', 'Madagascar', 'Africa'),
('MK', 'Skopje', 'North Macedonia', 'Europe'),
('ML', 'Bamako', 'Mali', 'Africa'),
('MM', 'Naypyidaw', 'Myanmar', 'Asia'),
('MN', 'Ulan Bator', 'Mongolia', 'Asia'),
('MR', 'Nouakchott', 'Mauritania', 'Africa'),
('MT', 'Valletta', 'Malta', 'Europe'),
('MU', 'Port Louis', 'Mauritius', 'Africa'),
('MV', 'Mal�', 'Maldives', 'Asia'),
('MW', 'Lilongwe', 'Malawi', 'Africa'),
('MX', 'Mexico City', 'Mexico', 'Americas'),
('MY', 'Kuala Lumpur', 'Malaysia', 'Asia'),
('MZ', 'Maputo', 'Mozambique', 'Africa'),
('NA', 'Windhoek', 'Namibia', 'Africa'),
('NE', 'Niamey', 'Niger', 'Africa'),
('NG', 'Abuja', 'Nigeria', 'Africa'),
('NI', 'Managua', 'Nicaragua', 'Americas'),
('NL', 'Amsterdam', 'Netherlands', 'Europe'),
('NO', 'Oslo', 'Norway', 'Europe'),
('NP', 'Kathmandu', 'Nepal', 'Asia'),
('NZ', 'Wellington', 'New Zealand', 'Oceania'),
('OM', 'Muscat', 'Oman', 'Asia'),
('PA', 'Panama City', 'Panama', 'Americas'),
('PE', 'Lima', 'Peru', 'Americas'),
('PG', 'Port Moresby', 'Papua New Guinea', 'Oceania'),
('PH', 'Manila', 'Philippines', 'Asia'),
('PK', 'Islamabad', 'Pakistan', 'Asia'),
('PL', 'Warsaw', 'Poland', 'Europe'),
('PT', 'Lisbon', 'Portugal', 'Europe'),
('PY', 'Asunci�n', 'Paraguay', 'Americas'),
('QA', 'Doha', 'Qatar', 'Asia'),
('RO', 'Bucharest', 'Romania', 'Europe'),
('RS', 'Belgrade', 'Serbia', 'Europe'),
('RU', 'Moscow', 'Russian Federation', 'Europe'),
('RW', 'Kigali', 'Rwanda', 'Africa'),
('SA', 'Riyadh', 'Saudi Arabia', 'Asia'),
('SC', 'Victoria', 'Seychelles', 'Africa'),
('SD', 'Khartoum', 'Sudan', 'Africa'),
('SE', 'Stockholm', 'Sweden', 'Europe'),
('SG', 'Singapore', 'Singapore', 'Asia'),
('SI', 'Ljubljana', 'Slovenia', 'Europe'),
('SK', 'Bratislava', 'Slovakia', 'Europe'),
('SL', 'Freetown', 'Sierra Leone', 'Africa'),
('SN', 'Dakar', 'Senegal', 'Africa'),
('SO', 'Mogadishu', 'Somalia', 'Africa'),
('SR', 'Paramaribo', 'Suriname', 'Americas'),
('SS', 'Juba', 'South Sudan', 'Africa'),
('ST', 'S�o Tom�', 'Sao Tome and Principe', 'Africa'),
('SV', 'San Salvador', 'El Salvador', 'Americas'),
('SY', 'Damascus', 'Syrian Arab Republic', 'Asia'),
('SZ', 'Mbabane', 'Eswatini', 'Africa'),
('TD', 'N\'Djamena', 'Chad', 'Africa'),
('TG', 'Lom�', 'Togo', 'Africa'),
('TH', 'Bangkok', 'Thailand', 'Asia'),
('TJ', 'Dushanbe', 'Tajikistan', 'Asia'),
('TL', 'Dili', 'Timor-Leste', 'Asia'),
('TM', 'Ashgabat', 'Turkmenistan', 'Asia'),
('TN', 'Tunis', 'Tunisia', 'Africa'),
('TR', 'Ankara', 'Turkey', 'Asia'),
('TT', 'Port of Spain', 'Trinidad and Tobago', 'Americas'),
('TW', 'Taipei', 'Taiwan', 'Asia'),
('TZ', 'Dodoma', 'Tanzania, United Republic of', 'Africa'),
('UA', 'Kyiv', 'Ukraine', 'Europe'),
('UG', 'Kampala', 'Uganda', 'Africa'),
('US', 'Washington, D.C.', 'United States of America', 'Americas'),
('UY', 'Montevideo', 'Uruguay', 'Americas'),
('UZ', 'Tashkent', 'Uzbekistan', 'Asia'),
('VA', 'Vatican City', 'Vatican City', 'Europe'),
('VE', 'Caracas', 'Venezuela (Bolivarian Republic of)', 'Americas'),
('VN', 'Hanoi', 'Vietnam', 'Asia'),
('YE', 'Sana\'a', 'Yemen', 'Asia'),
('ZA', 'Pretoria', 'South Africa', 'Africa'),
('ZM', 'Lusaka', 'Zambia', 'Africa'),
('ZW', 'Harare', 'Zimbabwe', 'Africa');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `countries`
--
ALTER TABLE `countries`
  ADD PRIMARY KEY (`alpha2code`),
  ADD UNIQUE KEY `alpha2Code` (`alpha2code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
