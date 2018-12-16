INSERT INTO `product` (`prod_id`, `prod_creation_date`, `prod_description`, `prod_designation`, `prod_end_date`)
VALUES (1, '2018-12-04 00:00:00', 'Vitalait', 'Lait', '2018-12-18 00:00:00'),
(2, '2018-12-11 00:00:00', 'Maestro', 'Chocolat', '2018-12-29 00:00:00');

INSERT INTO `fournisseur` (`frs_id`, `frs_adresse`, `frs_designation`, `frs_tel`) VALUES (1, 'Rout Ain km 4 ', 'Eya market', '74558441'), (2, 'Rout Ain km 5', 'Carrefour', '74886885');


INSERT INTO `price` (`frs_prod_id`, `amount`, `frs_id`, `prod_id`) VALUES (1, '1.200', '1', '1'), (2, '1.300', '2', '1')