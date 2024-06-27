INSERT INTO category_master (`category_id`, `category_name`) VALUES
('1', 'Clothing'),
('2', 'Home Appliances'),
('3', 'Books'),
('4', 'Electronics');

INSERT INTO product_master (`product_id`, `price`, `product_name`, `stock`) VALUES ('1','2000', 'Highlander Shirt', '100','1');
INSERT INTO product_master (`product_id`, `price`, `product_name`, `stock`, `category_id`) VALUES 
('2', '3500', 'Jeans', '120', '1'),
('3', '1500', 'Blender', '50', '2'),
('4', '800', 'Microwave', '40', '2'),
('5', '1000', 'Novel', '300', '3'),
('6', '1500', 'Comic Book', '150', '3'),
('7', '12000', 'Smartphone', '75', '4'),
('8', '5000', 'Headphones', '60', '4'),
('9', '1800', 'Sweater', '140', '1'),
('10', '2500', 'Dress', '90', '1'),
('11', '700', 'Toaster', '70', '2'),
('12', '1200', 'Mystery Book', '200', '3'),
('13', '16000', 'Laptop', '30', '4'),
('14', '6000', 'Tablet', '50', '4'),
('15', '400', 'Cookbook', '100', '3');
