-- Sales Analytics Project

-- 1. Total Sales
SELECT SUM(sales) AS total_sales
FROM sales_data;

-- 2. Total Profit
SELECT SUM(profit) AS total_profit
FROM sales_data;

-- 3. Total Orders
SELECT COUNT(order_id) AS total_orders
FROM sales_data;

-- 4. Total Quantity
SELECT SUM(quantity) AS total_quantity
FROM sales_data;

-- 5. Average Order Value
SELECT AVG(sales) AS average_order
FROM sales_data;

-- 6. Sales by Region
SELECT region, SUM(sales) AS total_sales
FROM sales_data
GROUP BY region
ORDER BY total_sales DESC;

-- 7. Sales by Category
SELECT category, SUM(sales) AS total_sales
FROM sales_data
GROUP BY category
ORDER BY total_sales DESC;

-- 8. Profit by Category
SELECT category, SUM(profit) AS total_profit
FROM sales_data
GROUP BY category
ORDER BY total_profit DESC;

-- 9. Sales by Product
SELECT product, SUM(sales) AS total_sales
FROM sales_data
GROUP BY product
ORDER BY total_sales DESC;
