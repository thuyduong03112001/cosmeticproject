create DATABASE DBCosmetic
GO

USE DBCosmetic
GO

--Bang Danh Muc San Pham
CREATE TABLE Categories (
	CategoryID int PRIMARY KEY,
	CategoryName nvarchar(100)
)

--Bang San Pham
CREATE TABLE Products(
	ProductID int PRIMARY KEY,
	CategoryID int foreign key references Categories(CategoryID),
	ProductName nvarchar(100),
	Price float,
	Amount int,
	SellID int,
	Images nvarchar(200),
	[Description] ntext
)

--Bang User
CREATE TABLE [User](
	AccountID int IDENTITY(1,1) not null PRIMARY KEY,
	FullName nvarchar(150) NULL,
	Phone nvarchar(50) NULL,
	[Address] nvarchar(500) NULL,
	[Name] varchar(100),
	[Password] nvarchar(100) not null,
	[Admin] int null
)
-- Bang Trang Thai Don Hang
CREATE TABLE OrderStatus(
    Id int IDENTITY(1,1) not null PRIMARY KEY,
	[Name] nvarchar(100)
)


--Bang Don Hang
CREATE TABLE Orders(
	ID int IDENTITY(1,1) not null PRIMARY KEY,
	[CreateDate] date default (getdate()),
	UserID int,
	StatusID int foreign key references OrderStatus(Id),
	TotalMoney money
)

--Bang Don Hang Chi Tiet
CREATE TABLE [Order Details](
	Id int PRIMARY KEY IDENTITY(1,1),
	OrderID int,
	ProductID int foreign key references Products(ProductID),
	ProductName nvarchar(100),
	Price float,
	Quantity int
)

--Bang Tin tuc
CREATE TABLE News(
	NewsID int PRIMARY KEY, 
	Title nvarchar(200),
	Content ntext
)

--Bang Lien He
CREATE TABLE Contact(
	ContactID int PRIMARY KEY IDENTITY(1,1),
	[Name] nvarchar(50),
	Email varchar(100),
	[Subject] nvarchar(200),
	[Message] ntext
)

INSERT INTO Categories(CategoryID, CategoryName)
VALUES(100, N'Chăm sóc da mặt')
INSERT INTO Categories(CategoryID, CategoryName)
VALUES(110, N'Trang điểm')
INSERT INTO Categories(CategoryID, CategoryName)
VALUES(120, N'Chăm sóc cơ thể')
INSERT INTO Categories(CategoryID, CategoryName)
VALUES(130, N'Thiết bị làm đẹp')

INSERT OrderStatus([Name]) VALUES (N'Chờ Xác Nhận')
INSERT OrderStatus([Name]) VALUES (N'Chờ Lấy Hàng')
INSERT OrderStatus([Name]) VALUES (N'Đang Giao')
INSERT OrderStatus([Name]) VALUES (N'Đã Giao')
INSERT OrderStatus([Name]) VALUES (N'Đã Hủy')


INSERT INTO [User](FullName, Phone, [Address], [Name], [Password], [Admin])
VALUES ('Admin', '0347973129', N'Ha Noi','Admin','123456', 1)

INSERT INTO [User](FullName, Phone, [Address], [Name], [Password], [Admin])
VALUES ('Thuy Duong', '0976049480', N'Ngõ 32, Phường Mễ Trì Hạ, Quận Nam Từ Liêm, Hà Nội','Thuy Duong','123', 0)


INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(1, 100, N'Tẩy Tế Bào Chết The Body Shop Tea Tree (100ml)', 250000, 50, 1, N'images/tdcbody.jpg', N'Tẩy Tế Bào Chết The Body Shop Tea Tree (100ml) nhẹ nhàng cuốn trôi đi mọi bụi bẩn, tẩy sạch lớp tế bào da chết và làm sạch tận lỗ chân lông giúp mang lại làn da vô cùng mềm mịn và tươi mới và giảm thâm mụn hiệu quả nếu sử dụng đều đặn.
Những hạt mát xa siêu nhỏ cũng giúp thải độc cho làn da và làm da sáng hơn.
Phù hợp cho làn da mụn và có khuyết điểm.
Không chứa hạt vi nhựa, thu nhỏ lỗ chân lông, trả lại làn da sáng rạng rỡ.
Dùng cho vùng ngực và lưng để làm sạch vùng da này.
Sản phẩm Tea Tree với một sự pha trộn của các thành phần hoạt tính tự nhiên giữ cho làn da tươi sáng bằng cách giúp ngăn ngừa nhược điểm và mụn đầu đen và kiểm soát dầu thừa.
Các sản phẩm Tea Tree còn chứa chiết xuất dầu tanamu, được biết đến với khả năng tái tạo mô mới và thúc đẩy quá trình chữa lành da.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(2, 100, N'Mặt Nạ Innisfree Green Barley Gom Mask 120ml', 170000, 70, 1, N'images/innisfree.jpg', N'Mặt Nạ Tẩy Tế Bào Da Chết Từ Lúa Mạch Xanh Innisfree Green Barley Gommage Mask 120ml có thành phần lúa mạch và Salicylic Acid tạo ra tác động kép trên da, loại bỏ lớp tế bào chết trên bề mặt da, vừa làm sạch sâu.
Chứa AHA (Acid Glycolic) + BHA (Salicylic) giúp da mịn màng hơn.
Không gây khô da, giúp da mịn màng hơn.
Phù hợp với mọi làn da.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(3, 100, N'Tẩy Tế Bào Chết Mặt Huxley Scrub Mask 30ml', 96000, 35, 1, N'images/huxley.jpg', N'Tẩy Tế Bào Chết Mặt Huxley Secret Of Sahara Scrub Mask Sweet Therapy 30ml là một trong ba sản phẩm đình đám của thương hiệu mỹ phẩm cao cấp này. Sản phẩm được chiết xuất từ cây xương rồng Sahara tươi và tinh dầu xương rồng ép cơ tay 100%, bao gồm các chất Axit Linolenic và vitamin E giúp da tẩy da chết mà không làm da bị khô căng.
Mặt Nạ Tẩy Tế Bào Chết Huxley có thiết kế dạng tuýp nhựa trong rất tiện dụng mỗi khi sử dụng. Nhìn bên ngoài có thể thấy được lượng sản phẩm và kết cấu tươi xanh của em ý, thật “mát mắt” phải không nè các cô gái.
Ngoài khả năng chính là tẩy da chết huxley còn là “cứu cánh” cho các nàng bị ám ảnh bởi mụn ẩn vì khi lấy tế bào chết đồng thời em mặt nạ này cũng giúp lỗ chân lông trở nên thông thoáng hơn rất nhiều.
Đối với các nốt mụn đang bị viêm cũng sẽ bớt hiện tượng sưng đỏ.
Axit Linolenic và vitamin E có trong tinh dầu hạt xương rồng chống lại sự oxy hóa của da hiệu quả giúp da trở nên mịn màng, sáng ngời và căng mọng.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(4, 100, N'Tẩy Tế Bào Chết Dành Cho Da Mụn Và Da Dầu Clinique', 469000, 45, 1, N'images/clinique.jpg', N'Làm sạch sâu lỗ chân lông, giúp lấy đi những lớp da chết Không làm khô rát da, không gây kích ứng da Dưỡng ẩm, cân bằng độ ẩm cho da, làm da sạch mịn, rạng rỡ Hỗ trợ tái tạo da, làm sáng vùng da thâm, sạm, nám Giảm mụn đầu đen, se khít lỗ chân lông, phục hồi làn da tươi trẻ Cung cấp những dưỡng chất có lợi cho da, làm mờ các nếp nhănTẩy Tế Bào Chết Dành Cho Da Mụn Và Da Dầu 7 Day Scrub Cream Rinse - Off Formula - Clinique - 667H010000 (100ml) giúp làm sạch sâu lỗ chân lông, lấy đi những lớp da chết
Không làm khô rát da, không gây kích ứng da.
Dưỡng ẩm, cân bằng độ ẩm cho da, làm da sạch mịn, rạng rỡ.
Hỗ trợ tái tạo da, làm sáng vùng da thâm, sạm, nám.
Giảm mụn đầu đen, se khít lỗ chân lông, phục hồi làn da tươi trẻ.
Cung cấp những dưỡng chất có lợi cho da, làm mờ các nếp nhăn.
Các sản phẩm của chúng tôi được phát triển trong môi trường phòng thí nghiệm và sản xuất trong qui trình hiện đại được quản lí nghiêm ngặt.
Clinique đảm bảo không thử nghiệm sản phẩm trên động vật theo chính sách tiêu chuẩn của Hoa Kì.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(5, 100, N'Nước Cân Bằng Ngăn Ngừa Mụn Mamonde Pore Clean Toner (250ml)', 259000, 26, 1, N'images/mamon.jpg', N'Nước Cân Bằng Làm Sạch Dầu Nhờn Và Ngăn Ngừa Mụn Mamonde Pore Clean Toner (250ml) 110651163 chứa tinh chất hoa diếp cá cùng thành phần bùn khoáng từ bờ biển phía Tây có khả năng làm sạch bã nhờn hiệu quả, giúp da mịn màng, giảm bóng nhờn.
Giúp kiểm soát bã nhờn và thu nhỏ lỗ chân lông. Mamonde sử dụng diếp cá tươi từ vùng đất trồng thân thiện với môi trường
Thành phần bùn từ bờ biển phía Tây giúp thấm hút bụi bẩn và bã nhờn sâu bên trong lỗ chân lông. Bùn dạng bột được trộn đều trong sản phẩm sẽ không lưu lại trên da khi sử dụng nên bạn hoàn toàn an tâm khi dùng sản phẩm. Sản phẩm được kiểm nghiệm dưới sự giám sát của các bác sĩ da liễu.
Giúp da mịn lì, không bóng dầu.
Loại da phù hợp: Da dầu và da hỗn hợp.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(6, 100, N'Nước hoa hồng Dear Klairs Supple Facial Toner 180ml', 269000, 18, 1, N'images/nuoc-hoa-hong-klairs.jpg', N'Klair Supple Preparation Facial Toner có chứa một số thành phần chính chiết xuất từ thực vật. 
Phyto-Oligo: tế bào gốc thực vật chứa rất nhiều yếu tố tăng trưởng có vai trò sữa chữa những khuyết thiếu của tế bào, đảo ngược quá trình lão hóa cũng như dưỡng ẩm, giúp da không bị khô. 
Axit amin lúa mì: chống viêm, giảm viêm và cung cấp độ ẩm sâu. 
Properies: giúp giảm mẩn đỏ trên da, giảm đỏ mụn trứng cá Klair luôn “thân thiện” với da, công thức cân bằng độ pH cho da giảm thiểu bụi bẩn và bã nhờn dư thừa trên da sau khi rửa mặt. 
Giúp da hấp thụ dinh dưỡng từ các bước chăm sóc sau tốt hơn. Đồng thời cung cấp độ ẩm để do luôn có “sức sống”.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(7, 100, N'Nước Cân Bằng La Roche-Posay Soothing Lotion Sensitive Skin - 200ml', 399000, 33, 1, N'images/larocheposay.jpg', N'Giàu nước khoáng La Roche-Posay Thành phần Selenium giúp làm dịu, bảo vệ và chống oxy hóa Nước cân bằng phù hợp cho làn da nhạy cảm nhất Hình ảnh sản phẩm có thể thay đổi theo từng đợt nhập hàng.
Nước cân bằng giàu khoáng dành cho da nhạy cảm La Roche-Posay Soothing Lotion Sensitive Skin 200ml với với thành phần chính từ nước khoáng thiên nhiên, không cồn, không soap giúp làm dịu da, cân bằng độ pH và dưỡng ẩm cực tốt cho những làn da siêu mẫn cảm. 
Với Nước cân bằng dành cho da nhạy cảm La Roche-Posay Soothing Lotion Sensitive Skin, làn da của bạn sẽ được làm sạch, cân bằng độ pH, cấp ẩm tự nhiên, cho làn da mềm mại và mịn màng hơn. 
Soothing Lotion cũng chính là một phương pháp làm sạch lớp make-up hiệu quả và cân bằng da đặc biệt dành riêng loại da siêu nhạy cảm với thành phần chính từ nước khoáng thiên nhiên. 
Sản phẩm chính là giải pháp hợp lý cho những bạn có làn da siêu mẫn cảm, cực khó chọn toner.') 

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(8, 100, N'Sữa Rửa Mặt Tạo Bọt Laneige Multi Deep Clean Cleanser 50ml', 465000, 50, 1, N'images/laneige.jpg', N'Sữa Rửa Mặt Tạo Bọt Làm Sạch Sâu Laneige Multi Deep Clean Cleanser 50ml được chiết xuất từ nhựa của quả đu đủ xanh và quả việt quất, giúp làm sạch sâu lớp trang điểm, kem chống nắng, bụi bẩn, tế bào da chết nhẹ nhàng, giúp mang đến làn da trông tươi sáng và mịn màng.
Dòng sữa rửa mặt đa năng mới Langeige Multi Deep-Clean Cleanser giúp làm sạch các lớp trang điểm, bụi mịn và các tế bào da chết cùng một lúc Langeige Moist Cream Cleanser giúp làm sạch sâu lỗ chân lông và giúp giữ ẩm cho làn da ngay cả sau khi rửa mặt Langeige Multi Deep-Clean Cleanser Sữa rửa mặt đa năng giúp làm sạch lớp trang điểm, kem chống nắng, tế bào da chết và bụi mịn mang đến một làn da trông tươi sáng và mịn màng.
Khả năng tạo nhiều bọt chỉ với 1 lượng nhỏ sản phẩm, tiết kiệm khi sử dụng. Sữa rửa mặt dịu nhẹ, giúp làn da trông sáng mịn.
Làm sạch da cùng một lúc Sữa rửa mặt chỉ với duy nhất 1 bước giúp rửa sạch lớp trang điểm, lớp kem chống nắng, tế bào da chết cũng như làm sạch bụi trên da giúp da trông sáng mịn.
Giúp làn da trông mềm mịn bằng cách làm sạch tế bào da chết mỗi ngày. Sữa rửa mặt dịu nhẹ với thành phần dưỡng ẩm được chiết xuất từ thực vật giúp làm sạch các tế bào da chết, các hạt bọt mịn sẽ giúp bạn có một làn da sạch và mịn màng.
Giúp làn da trông tươi sáng sau khi được làm sạch Sữa rửa mặt được chiết xuất từ quả việt quất giúp làn da trông tươi sáng và mềm mượt.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(9, 100, N'Sữa Rửa Mặt Cetaphil Gentle Skin Cleaner (500ml)', 245000, 50, 1, N'images/centaphil-3.jpg', N'Sữa Rửa Mặt Cetaphil Gentle Skin Cleaner (500ml) có công thức không xà phòng đã đạt được nhiều giải thưởng trong lĩnh vực làm đẹp và chăm sóc sức khỏe.
Sữa rửa mặt dịu nhẹ Cetaphil với công thức đặc biệt để giảm thiểu chất nhờn trên mặt, tẩy sạch bụi bẩn và trang điểm mà không làm cho da bạn bị khô ráp.
Cetaphil Gentle Skin Cleanser có công thức phù hợp cho mọi loại da, kể cả da em bé.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(10, 100, N'Sữa Rửa Mặt Normaderm Deep Cleansing Foaming Cream Vichy 125ml', 349000, 55, 1, N'images/vichy.jpg', N'Sữa Rửa Mặt Tạo Bọt Ngăn Ngừa Mụn Và Se Lỗ Chân Lông - Normaderm Anti-perfection Deep Cleansing Foaming Cream Vichy 125ml
Thuộc dòng sản phẩm Normaderm - Dành cho Khách hàng có bề mặt da có nhiều bóng dầu và mụn, lỗ chân lông bị tắc nghẽn. Nam và nữ độ tuổi từ 18 - 35 gặp các vấn đề về tuyến dầu hoạt động mạnh dễ thu hút bụi bẩn, kết hợp với tế bào chết tích tụ. Lỗ chân lông bị bít tắc là lúc vi khuẩn gây mụn càng sinh sôi nảy nở dẫn đến kích ứng và nhiễm trùng da từ đó gây nên mụn.
Sữa Rửa Mặt Tạo Bọt Ngăn Ngừa Mụn Và Se Lỗ Chân Lông - Normaderm Anti-perfection Deep Cleansing Foaming Cream Vichy 125ml làm sạch làn da hiệu quả với thành phần chứa Acid Salycilic được biết đến với khả năng đầy lùi mụn, nhẹ nhàng làm sạch và mang đến làn da mềm mại. Dạng kem (cream) giúp sữa rửa mặt không làm khô da như các dạng sữa rửa mặt thông thường khác.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(65, 100, N'Kem Dưỡng Cấp Nước Neutrogena Hydro Boost 50ml', 390000, 30, 1, N'images/neutrogena.jpg', N'Neutrogena Hydro Boost là một loại kem dưỡng ẩm dạng Gel - Nước có cấu trúc nhẹ và chứa một loại gel hyaluronic độc đáo giúp cấp nước cho da ngay lập tức, đồng thời khóa lại quá trình bay hơi, giúp cho độ ẩm da duy trì được cả ngày dài. 
Công Nghệ Hydro Boost độc quyền giúp làn da điều tiết nước theo nhu cầu, và thanh lọc Acid Hylauronic - hoạt chất có khả năng tích nước đên hơn 1000 lần khối lượng nó, để dự trữ và giải phóng khi làn da cần.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(73, 100, N'Tinh Chất Dưỡng Da Klairs Freshly Juiced Vitamin Drop (35ml)', 245000, 20, 1, N'images/serum.jpg', N'Tinh Chất Làm Sáng Da Klairs Freshly Juiced Vitamin Drop (35ml) - Tặng Kèm 1 Đôi Bông Tai Ngẫu Nhiên có thành phần chiết xuất từ Ascorbic Acid là một loại dẫn xuất từ Vitamin C tinh khiết với hàm lượng 5% có tác dụng làm mờ vết thâm, ức chế việc hình thành sắc tố melanin, chống oxy hóa mạnh mẽ đồng thời kích thích tăng sinh collagen nhằm phục hồi, tăng cường độ đàn hồi cho da.
Chiết xuất rau má còn giúp làm dịu làn da tổn thương, giảm kích ứng và tăng cường lớp màng hàng rào bảo vệ da.
Sản phẩm có kết cấu dạng lỏng, không mùi thẩm thấu nhanh chóng vào da.
Sau đó để lại lớp màng căng bóng, khỏe mạnh mà không gây cảm giác khó chịu, nhờn dính trên da.
Đặc biệt, Klairs Freshly Juiced Vitamin Drop với thành phần 4 KHÔNG: "không chất tạo màu, không cồn, không paraben, không chứa hương liệu", an toàn cho cả làn da nhạy cảm.
Sản phẩm thích hợp với mọi loại da, kể cả làn da nhạy cảm.
Hỗ trợ phục hồi và trẻ hóa làn da. Cải thiện làn da sạm đen, xỉn màu.
Se khít lỗ chân lông, chống viêm da. Mang đến làn da tươi trẻ, đầy rạng rỡ.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(13, 100, N'Kem chống nắng Anessa Perfect UV Sunscreen Milk SPF 50+ PA++++ 60ml', 540000, 20, 1, N'images/kem-chong-nang-Anessa.jpg', N'Kem chống nắng dưỡng da dạng sữa Anessa Perfect UV Sunscreen Skincare Milk - 60mL – SPF 50+/ PA++++ với gần 100 năm nghiên cứu chuyên sâu về chống nắng sẽ mang đến cho bạn:
Chống trôi trong nước & mồ hôi với công nghệ độc quyền Aqua Booster, lên đến 80 phút trong hồ bơi.
Công nghệ “chống ma sát” độc đáo lần đầu tiên có trong sữa chống nắng, càng ma sát, lớp chống nắng mịn mượt sẽ không bị bong ra và gia tăng khả năng chống nắng, bảo vệ da hơn.
Kem chống nắng công nghệ chống nắng 360° ngăn chặn tác hại của tia UV trên mọi bề mặt da và mọi góc độ.
Chống cát dính vào da.
Kem chống nắng với 50% chiết xuất dưỡng da (chiết xuất hoa hồng, collagen, lô hội và super Hyaluronic Acid) giúp da mịn mượt, chống oxi hóa và ngăn chặn tình trạng lão hóa sớm do tác hại tia UV.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(15, 100, N'Sữa Chống Nắng Sunplay Skin Aqua Clear White SPF 50+, PA++++ (25g)', 150000, 50, 1, N'images/sunplay.jpg', N'Sữa Chống Nắng Hằng Ngày Dưỡng Trắng Sunplay Skin Aqua Clear White SPF 50+, PA++++ (25g) - Hệ dưỡng ưu việt chứa Collagen, Hyaluronic Acid, Amino Acid dưỡng da săn chắc, ngừa lão hóa da sớm và lưu giữ độ ẩm tối đa. Dẫn xuất Vitamin C & B3 hàm lượng cao giúp làm mờ vùng da sạm màu, phục hồi các hư tổn da do nắng, cho hiệu quả dưỡng trắng mịn tối ưu.
Dạng sữa thấm nhanh, không gây nhờn rít, thích hợp với mọi loại da.
Khả năng chịu nước và mồ hôi cao.
Thích hợp dùng làm lớp lót trang điểm.
PA++++ tăng cường chống mọi loại tia UV (gây đen sạm, nám, tàn nhang, nếp nhăn, đốm nâu,…)')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(16, 100, N'Mặt Nạ Giấy Cho Da Nhạy Cảm Innisfree My Real Squeeze Mask 20ml', 20000, 100, 1,N'images/mask.jpg', N'Mặt Nạ Giấy Dưỡng Ẩm Phục Hồi Da Innisfree My Real Squeeze Mask 20ml chiết xuất từ các thành phần thiên nhiên vắt tươi giúp cải thiện từng vấn đề da khác nhau tha hồ cho bạn lựa chọn.
Chất liệu 100% cellulose mỏng nhẹ, làm từ bạc hà giúp đưa dưỡng chất hiệu quả vào làn da.
Phương pháp vắt và ép lạnh để tối ưu nhất các thành phần giàu dưỡng chất.
Có 3 dạng mặt nạ giấy: Dạng tinh chất dưỡng ẩm phục hồi da; Dạng nước tinh chất dịu mát; Dạng kem giàu dinh dưỡng.
Thiết kế thông minh với 2 miếng vải dư nằm ngoài khuôn mặt giúp gỡ mặt nạ ra một cách dễ dàng.
Phù hợp mọi loại da.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(17, 100, N'Hộp 10 Mặt nạ dưỡng da ngăn ngừa lão hóa da Mediheal Collagen', 175000, 45, 1, N'images/mask1.jpg', N'Mặt nạ Mediheal Collagen Impact Essential Mask Ex được các chuyên gia chăm sóc sắc đẹp của Hàn Quốc nghiên cứu và áp dụng công thức collagen lấy từ biển sâu góp phầnchăm sóc dahiệu quả hơn. 
Các dưỡng chất có trong mặt nạ sẽ giúp cung cấp độ ẩm, làm tăng độ đàn hồi cho da. 
Mặt nạ cũng được làm từ cotton cao cấp nên đảm bảo an toàn cho làn da của bạn.
Mặt nạ Mediheal Collagen Impact Essential Mask có chứa Collagen tự nhiên, giúp da hấp thu Collagen ngoại sinh, nuôi dưỡng và cung cấp sức sống, độ ẩm mang lại vẻ tươi trẻ cho làn da đang và sắp lão hóa. 
Mặt nạ hỗ trợ điều trị, cải thiện kết cấu da, làm mờ vết nhăn và săn chắc làn da chảy xệ.
Sản phẩm có thành phần hoàn toàn từ thiên nhiên, không có chất hóa học, không có độc tố, phù hợp với mọi loại da kể cả da nhạy cảm.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(18, 110, N'Son kem lì Bbia Last Velvet Lip Tint - 25 Final Note 5g (màu đỏ nâu đất)', 185000, 40, 1, N'images/bbia.jpg', N'Chất son đậm, bám chặt như nam châm. Chỉ cần thoa 1 lớp là màu sẽ lên rõ và sống động Các phân tử nhỏ liên kết chặt chẽ như phấn giúp che đi những khuyết điểm cho bờ môi tươi tắn và khỏe mạnh Giữ màu bền chặt suốt ngày dài, khả năng giữ màu mạnh như xăm Dòng Version 5 sẽ có tên là NOTE SERIES với 5 màu phù hợp với làn da Châu Á.
Son kem lỳ Bbia Last Velvet Lip Tint Version 5: Son kem lỳ Bbia Last Velvet Lip Tint là dòng son lỳ với độ bám dính cực cao, hút vào môi bạn như nam châm và lên màu rõ ràng chỉ sau một lần thoa.
Thân son bằng nhựa trong giúp nàng dễ dàng lựa chọn màu son mỗi khi dùng.
Phần nắp ánh kim màu nâu đồng thời thượng.
Kết cấu son Bbia Last Velvet Lip Tint là chất son tint kết hợp son kem bền màu, bám chặt lên môi, lên màu chuẩn sắc. Khi thoa lên môi mướt mịn như nhung, không bị vón cục và dễ dàng tán đều. Sau khi ăn uống nhẹ sẽ để lại lớp tint nhẹ trên môi.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(19, 110, N'Phấn Phủ Kiềm Dầu Dạng Bột Khoáng Innisfree No Sebum Mineral Powder 5g', 120000, 30, 1, N'images/phanphu.jpg', N'Phấn Phủ Kiềm Dầu Dạng Bột Khoáng Innisfree No Sebum Mineral Powder 5g - 131170490 dạng bột có chiết xuất 100% từ bạc hà và hạt ngọc trai giúp kiềm hút dầu và loại bỏ bã nhờn dư thừa trên da mang đến làn da sáng mịn.
Hệ thống kiểm soát bã nhờn theo 2 lớp: phấn bột hút sạch lớp dầu, mồ hôi trên da đồng thời kiểm soát bã nhờn.
Thành phần 100% từ thiên nhiên, không có mùi hoá học, không gây kích ứng cho da, bao gồm cả làn da hay mẫn cảm với mỹ phẩm trang điểm.
Phấn bột đánh lên tiệp với màu da, không màu mang đến làn da tự nhiên tạo lớp nền lì và mịn.
Kiểm soát bả nhờn khi da tiết dầu quá bóng nhờn, có thể sử dụng thay thế giấy thấm dầu.
Làm lớp phấn phủ kiềm dầu sau khi dùng kem nền giúp lớp trang điểm lâu trôi, xoá tan cảm giác khó chịu vì nhờn rít.
Sử dụng như kem lót vùng da quanh mắt trước khi sử dụng phấn mắt để phấn mắt lên chuẩn và lâu trôi hơn.
Giúp hút dầu từ chân tóc khi bị bết, ra dầu.
Giúp khô thoáng và khử mùi cơ thể bằng cách dặm phấn vào vùng da dễ tiết mồ hôi như nách.
Phù hợp với làn da tiết nhiều dầu.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(20, 110, N'Kem Nền Mịn Kiềm Dầu Fit Me Maybelline New York Foundation 30ml', 160000, 55, 1, N'images/maybeline.jpg', N'Kem nền số 1 tại Mỹ Ưu điểm vượt trội: Kem nền có khả năng kiềm dầu tốt, cho lớp nền luôn mịn lì.
Độ che phủ: trung bình- cao, che khuyết điểm & lỗ chân lông hoàn hảo.
Hiệu ứng: mịn lì tự nhiên.
Tông màu: 12 tông màu tiệp mọi tông da Việt Nam Kem nền lý tưởng cho da thường, da hỗn hợp và da dầu Bao bì cải tiến với đầu nhấn tiện lợi. 
Sản phẩm khuyên dùng trong thời gian từ 6-12 tháng sau khi mở nắp.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(21, 110, N'Bút Kẻ Mắt Kháng Nước MayCreate Eyeline Cao Cấp BK12', 90000, 34, 1, N'images/maycreate.jpg', N'Bút lông kẻ mắt Maycreate với đầu lông kĩ thuật công nghệ cao, ứng dụng vật liệu siêu bền mới nhất, vừa êm vừa nét, vẽ đường kẻ mắt siêu dễ siêu nhanh, bền đẹp cực nét. 
Sản phẩm Maycreate eyeliner tạo ra những đường liner sắc nét và nuột nà, lại cực kì êm dịu, nhẹ nhàng với vùng da mắt vô cùng nhạy cảm, tạo những nét vẽ mảnh như một sợi tơ, mỏng, mềm, nhẹ nhàng, chỉ dày ~ 0.1mm. 
Chúng ta tha hồ sử dụng để sáng tạo những đường liner vô cùng “tự nhiên, nhẹ nhàng” hoặc đậm nét, tất cả đều đen nhánh, nhìn rất thật, đem ấn tượng đến cho đôi mắt, tạo điểm nhấn cho đôi mắt.
Về hình thức: Vỏ ngoài màu đen, hoặc hồng nhìn rất sang chảnh.
Thiết kế đơn giản, chỉ có một dòng chữ Maycreate màu bạc: rất đẹp, rất tinh tế.
Đầu bút gọn, nhỏ để cho ra những đường kẻ mảnh và chính xác: ngòi bút rất mảnh và sắc nét, lông bút mềm, đầu bút dài khoảng 1 cm đúng chất một chiếc bút lông.
Chất lượng: Bút lông kẻ mắt Maycreate với đầu lông kĩ thuật công nghệ cao, ứng dụng vật liệu siêu bền mới nhất, vừa êm vừa nét, vẽ đường kẻ mắt siêu dễ siêu nhanh, bền đẹp cực nét.
Sản phẩm Maycreate eyeliner tạo ra những đường liner sắc nét và nuột nà, lại cực kì êm dịu, nhẹ nhàng với vùng da mắt vô cùng nhạy cảm, tạo những nét vẽ mảnh như một sợi tơ, mỏng, mềm, nhẹ nhàng, chỉ dày ~ 0.1mm.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(22, 110, N'Bộ cọ trang điểm 13 cây MAANGE chuyên nghiệp màu xanh lá cây', 499000, 10, 1, N'images/cotrangdiem.jpg', N'Bộ sản phẩm gồm:1 cọ nền, 1 cọ tán phấn, 1 cọ che khuyết điểm, 1 cọ tạo khối, 1 cọ mắt, 1 cọ mí mắt, 1 cọ son , 1 cọ lông mày, 1 cọ hightlight, 1 cọ phấn mắt, 1 cọ bầu mắt, 1 cọ chuốt, 1 cọ chải lông mày. Lông cực kỳ mịn đánh không bị rát mặt. Bộ sản phẩm gồm nhiều món rất tiện cho việc trang điểm.
Bộ sản phẩm gồm:1 cọ nền, 1 cọ tán phấn, 1 cọ che khuyết điểm, 1 cọ tạo khối, 1 cọ mắt, 1 cọ mí mắt, 1 cọ son , 1 cọ lông mày, 1 cọ hightlight, 1 cọ phấn mắt, 1 cọ bầu mắt, 1 cọ chuốt, 1 cọ chải lông mày.
Lông cực kỳ mịn đánh không bị rát mặt.
Bộ sản phẩm gồm nhiều món rất tiện cho việc trang điểm.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(23, 110, N'Phấn Nền mỏng mịn lâu trôi LOreal True Match TWC (8g)', 210000, 20, 1, N'images/phannen.jpg', N'Phấn Nền Mịn Da Loreal True Match TWC là một trong những dòng phấn nền mới của thương hiệu Loreal. Sản phẩm có kết cấu hạt phấn cực mịn và công thức không bóng dầu giúp bạn có được lớp nền trang điểm hoàn hảo, cho làn da mượt hơn và không hề bóng dầu suốt nhiều giờ liền.
Hộp phấn có thiết kế nhỏ gọn, linh hoạt, bạn có thể cất trong túi xách và đem theo để sử dụng bất cứ khi nào cần.
Sản phẩm phối hợp hoàn hảo với nhều tông màu khác nhau từ tông sáng đến tối cho từng loại da, giúp bạn dễ dàng lựa chọn loại phấn phù hợp.
Loreal True Match TWC có chỉ số chống nắng cao SPF 36 PA++, giúp bảo vệ làn da của bạn khỏi các tia UV có hại trong suốt 8 giờ liền. 
Phấn giữ da thông thoáng đồng thời che phủ khuyết điểm cho làn da mịn màng.
Kết cấu gồm các hạt phấn siêu nhỏ mịn, đem đến lớp nền tự nhiên và hoàn hảo, giữ da luôn tươi sáng và ngăn ngừa lão hóa.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(24, 110, N'Gương trang điểm để bàn - đèn led', 145000, 15, 1, N'images/guong.jpg', N'Chất liệu viền gương: nhựa cứng chắc chắn Đèn cắm điện dây USB Chiều cao : 30 cm Đường kính gương 17.5 cm
Chức năng: hỗ trợ trang điểm
Màn hình cảm ứng
Chế độ ánh sáng: Trắng
Hệ thống đèn led được bố trí quang viền gương tiện lợi cho việc make up.
Xoay dễ điều chỉnh gương phù hợp với tầm nhìn của bạn.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(25, 120, N'Sữa Tắm Dove Căng Bóng Sáng Mịn 530G', 230000, 25, 1, N'images/dove.jpg', N'Sữa tắm Dove Căng bóng sáng mịn lấy cảm hứng từ bí quyết làm đẹp của người phụ nữ Nhật 
Chiết xuất hoa sen và nước gạo Nhật giúp làn da căng mịn. 
Công thức dịu nhẹ mang lại làn da sạch và khỏe.
Sản phẩm mang lại một làn da căng bóng sáng mịn và một trải nghiệm dịu nhẹ chỉ sau một lần tắm.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(26, 120, N'Lăn Khử Mùi Etiaxil Détranspirant Traitement Sensibles 15ml', 375000, 20, 1, N'images/etiaxil.jpg', N'Thương hiệu: Etiaxil Xuất xứ: Pháp 
Màu xanh: Dành cho da hỗ hợp, đặc biệt là da nhạy cảm Khử mùi tuyệt đối 100% và ngăn mồ hôi tới 75% ngay từ lần lăn đầu tiên Không màu, không mùi, không ướt dính, không gây ố vàng áo. 
Hiệu quả từ 2-3 ngày không cần lăn lại (tắm rửa thoải mái) 
Lăn khử mùi Etiaxil hầu như không gây kích ứng hoặc dị ứng trên da.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(27, 120, N'Xà Phòng Giảm Mụn Lưng For Back 135g Nhật Bản', 125000, 20, 1, N'images/soap.jpg', N'Xà phòng hỗ trợ trị mụn lưng For Back của hãng Pelican Japan, nổi tiếng với các sản phẩm trị mụn của Nhật Bản. 
Với chiết xuất từ than hoạt tính, cam thảo và bùn khoáng thiên nhiên, chỉ sau 2-3 tuần sử dụng For Back Soap bạn sẽ cảm nhận được tình trạng mụn lưng được cải thiện rõ rệt. 
Trả lại cho bạn làn da mịn màng, tươi trẻ.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(28, 120, N'Tinh chất làm mềm, mượt và sáng da body 10% AHA - Paula Choice', 890000, 40, 1, N'images/paulachoice.jpg', N'Chống lão hóa, ức chế sự đậm màu của đốm nâu, làm đều màu và hỗ trợ giảm tình trạng viêm da 10% AHA được khoa học chứng minh loại bỏ lớp sừng trên bề mặt da, mang lại làn da vô cùng mềm mại sau khi sử dụng, kết hợp với bơ hạt mỡ và các thành phần chống lão hoá giúp tối ưu hoá hiệu quả sản phẩm Dành cho mọi loại da, đặc biệt da bị dày sừng và viêm nang lông
Sản phẩm chứa đầy đủ các loại axit gylcolic, khiến bề mặt da thay đổi một cách đáng ngạc nhiên và loại bỏ những tế bào chết cũ. Skin Revealing Body Lotion với 10% Alpha Hydroxy Acid có chứa shea butter và glycerin – hai hoạt chất giữ ẩm đứng hàng top trong bản thành phần.
Hiệu quả nổi bật: Axit Glycolic rất hữu ích trong việc thanh tẩy tế bào chết, trẻ hoá và làm sáng, đều màu da. Kết hợp với các thành phần dưỡng ẩm hiệu quả : bơ hạt mỡ, glycerin và hoạt chất hỗ trợ giảm kích ứng da như Allantoin đã tạo ra một sản phẩm chăm sóc da cơ thể hiệu quả.
Vitamin C và E, cùng dầu hạt nho và chiết xuất thảo mộc góp phần tối ưu hoá hiệu quả chống lão hoá của sản phẩm
Sản phẩm không chứa cồn, hương liệu và chất tạo màu, thích hợp với da nhạy cảm')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(29, 120, N'Xịt Thơm Toàn Thân ShiMang Body Mist 50ml', 75000, 30, 1, N'images/bodymist.jpg', N'Xịt thơm toàn thân Body mist là sản phẩm kết hợp giữa sữa dưỡng thể và nước hoa. Đây là dòng sản phẩm mang tính năng 2 trong 1 vừa đem lại hương thơm cho bạn lại vừa giúp nuôi dưỡng làn da mỏng manh khỏi những kích ứng không cần thiết mà dòng nước hoa thông thường không có được.
Xịt thơm toàn thân Body mist khác với nước hoa (perfume) ở chỗ mùi thơm của Xịt thơm toàn thân body mist không đậm đặc và bám dai, mà chỉ thoang thoảng nhẹ nhàng, thơm một cách kín đáo. Do đó, bạn có thể xịt body mist bất cứ lúc nào, bất cứ chỗ nào trên cơ thể mà ko sợ làm người khác có cảm giác nhức đầu với mùi hương quá nồng nặc, đặc biệt trong không gian kín và hẹp.
Mùi thơm của Xịt thơm toàn thân Shimang body mist không đậm đặc và bám dai. Ngoài ra, Xịt thơm toàn thân Shimang Body mist còn có tác dụng dưỡng ẩm, dưỡng da mà nước hoa không hề có. Có thể nói Xịt thơm toàn thân Shimang Body mist là sự lựa chọn tuyệt với cho những ai yêu thích sự nhẹ nhàng mà vẫn quyến rũ, phù hợp với mọi độ tuổi, cả nam lẫn nữ.
Nên dùng Xịt thơm toàn thân Shimang Body mist hay nước hoa (perfume): Nếu bạn đơn thuần bạn chỉ muốn giữ mùi hương thơm trên cơ thể thì bạn có thể lựa chọn nước hoa. Nhưng nếu bạn sở hữu làn da khô vừa muốn vừa thơm vừa dưỡng ẩm cho da, bạn có thể nghĩ đến việc sử dụng Xịt thơm toàn thân Shimang Body mist, Các chị em có thể sử dụng body mist cho những ngày thường nhật và nước hoa cho những dịp đặc biệt. Xịt thơm Shimang Body Mist phù hợp với mọi lứa tuổi từ Học Sinh, Sinh viên, người đi làm.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(30, 120, N'Sữa Dưỡng Thể Dưỡng Trắng Nivea Giúp Phục Hồi & Chống Nắng SPF 30 (200ml)', 129000, 35, 1, N'images/nivea.jpg', N'Sữa Dưỡng Thể Dưỡng Trắng Nivea Giúp Phục Hồi & Chống Nắng SPF 30 (200ml) được bổ sung thêm collagen giúp phục hồi các vấn đề về da do nắng gây ra đồng thời tăng cường thêm chỉ số SPF30 & PA++ giúp bảo vệ da khỏi tác hại tia UVA/UVB mang lại cho bạn làn da trắng sáng, mịn màng cùng hương thơm nhẹ nhàng, quyến rũ.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(31, 130, N'Máy Rửa Mặt Emmie By Happy Skin Premium Facial Cleansing Brush', 799000, 15, 1, N'images/emmie.jpg', N'Máy rửa mặt Emmié thiết kế đặc biệt với bề mặt silicone thế hệ mới - Food Grade Liquid Silicone đạt chứng nhận FDA Hoa Kỳ.
Máy rửa mặt đạt chuẩn chống nước IPX7 sử dụng và vệ sinh cách an toàn, dễ dàng.
Dùng massage, làm sạch, chăm sóc da với 3677 sợi Food grade Liquid Silicone được sắp xếp dạng ma trận.
Thiết bị làm đẹp có 7 tần số rung khác nhau từ mạnh đến nhẹ, phù hợp với mọi loại da.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(32, 130, N'Máy Uốn Ép Tóc Thời Trang Đa Năng Tạo Kiểu Tóc Thông Minh.', 1650000, 20, 1, N'images/MAYEP.jpg', N'Có 4 mức chỉnh nhiệt : 140 - 160 - 180 - 200 °C -> Phù hợp cho mọi loại tóc : Mềm, Thường, Dày, Khô 2 trong 1 : vừa Duỗi tóc, vừa Uốn tóc (làm phồng, uốn cong, uốn xoăn...bồng bềnh và quyến rũ) 
Chiều dài dây : 1,8 mét, xoay 360 độ - thuận lợi khi sử dụng.
Sử dụng cho cả 2 loại tóc ướt và Khô : Duỗi tóc thẳng / Uốn tóc xoăn / khóa bên trong và bên ngoài.
Nhiệt độ tăng nhanh : 10 giây & ổn định.
Lớp men phủ gốm : Gốm Tourmaline giúp chống hư tổn tóc tuyệt đối. 
Thanh gia nhiệt kết hợp cùng lớp phủ Ceramic Tourmaline - giúp mái tóc bạn chống hư tổn tuyệt đối.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(33, 130, N'Máy Sấy Tóc Công Suất Cao Chế Độ Sấy Lạnh Bảo Vệ Tóc FLYCO 2200W', 550000, 23, 1, N'images/maysay.jpg', N'Máy Sấy Tóc Công Suất Cao Chế Độ Sấy Lạnh Bảo Vệ Tóc FLYCO 2200W FH1610 với kiểu dáng trang nhã, nhỏ gọn tiện dụng, làm khô tóc, tạo kiểu nhanh chóng giúp bạn tiết kiệm thời gian.
Máy sấy có 2 tính năng sấy nóng, sấy mát tùy chọn tùy vào độ dày, loại tóc mà bạn lựa chọn tốc độ sấy phù hợp để giúp làm khô tóc mà vẫn duy trì độ ẩm, bảo vệ tóc hiệu quả.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(34, 130, N'Máy Massage Mặt Làm Đẹp Da 5 in 1 Photon', 2900000, 25, 1, N'images/massage.jpg', N'1 máy nhỏ gọn giải quyết, cải thiện 7 vấn đề về da mặt: Rửa sạch sâu, sóng âm T-Sonic đánh bật bụi bẩn, cặn trên da mặt giữ cho lô chân lông sạch sẽ và thoáng khí.
Thu nhỏ lô chân lông, cải thiện làn da.
Thúc đẩy quá trình hấp thụ chất dưỡng da, hạn chế lãng phí mỹ phẩm.
Khóa giữ chất dưỡng da, phát huy tối đa hiệu quả chất dưỡng Photon nóng và lạnh (6-42 ºC) co giãn, săn chắc làn da EMS lifting kích thích cơ mặt tăng tính đàn hồi, 
làm mờ nếp nhắn Kết hợp chế độ ánh sáng đỏ và xanh dương, trẻ hóa sáng da và giảm mụn.
Ánh sáng đỏ phù hợp cho da khô, ánh sáng xanh dương phù hợp cho da dầu.
Thuận tiện chăm sóc spa da mặt hàng ngày tại nhà hoặc đi du lịch.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(35, 130, N'Bộ Dụng Cụ Làm Móng Vàng Hồng 18 Món', 169000, 40, 1, N'images/mong.jpg', N'Chất liệu thép không gỉ cao cấp, không dễ bị gỉ, đủ cứng cáp và bền bỉ cho thời gian sử dụng lâu dài.
Đi kèm hộp, thời trang và thanh lịch, đẹp mắt để giữ tất cả các công cụ của bạn được sắp xếp và mang đi.
Bao gồm 18 cái công cụ chăm sóc khác nhau cho tay, chân và mặt, đáp ứng nhu cầu cơ bản của bạn.
Tay nghề tinh tế, mang đến cho bạn trải nghiệm chăm sóc da mặt / tay / chân hiệu quả.
Một sự lựa chọn món quà tuyệt vời cho gia đình, bạn bè hoặc đồng nghiệp của bạn.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(36, 130, N'Máy triệt lông cầm tay Titan Lite Black', 3050000, 30, 1, N'images/titan.jpg', N'Titan Lite Black là máy triệt lông cầm tay tốt nhất bằng công nghệ IPL đến từ Singapore, lần đầu tiên xuất hiện tại Việt Nam. 
Máy có tác dụng trên toàn bộ cơ thể với thời gian điều trị nhanh chóng. 
Máy sử dụng công nghệ triệt lông bằng ánh sáng IPL tiên tiến nhất.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(40, 120, N'Bàn Chải Điện P/S S100 PRO - Công Nghệ Sóng Âm', 845000, 50, 1, N'images/banchai.jpg', N'Bàn chải điện P/S S100 PRO sử dụng công nghệ sóng âm Sonic giúp làm sạch mảng bám tới 10 lần so với bàn chải thông thường.
Bộ sản phẩm bao gồm: 01 thân bàn chải điện, 02 đầu chải, 01 bộ sạc USB
Đặc điểm vượt trội:
Công nghệ sóng âm tiên tiến tạo nên các hạt siêu bọt - Microbubble, sạch hiệu quả mà vẫn dịu nhẹ cho nướu
Gấp 100 lần nhịp chải so với việc chải răng thông thường
Cơ chế chải răng thông minh, giúp chải răng đúng và đủ 2 phút theo khuyến nghị của nha sĩ
3 chế độ chải răng linh hoạt: Sạch Sâu, Chăm Sóc Nướu, Trắng răng
30 ngày sử dụng chỉ với 1 lần sạc. Cổng sạc USB tiện lợi, dễ dàng cắm sạc ở bất cứ đâu
100% chống nước - đạt tiêu chuẩn IPX7.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(42, 120, N'Combo 2 Nước Súc Miệng Hương Bạc Hà Listerine Cool Mint (750ml/Chai)', 167000, 30, 1, N'images/nuoc-suc-mieng.jpg', N'Combo 2 Nước Súc Miệng Hương Bạc Hà Listerine Cool Mint (750ml/Chai) giúp bảo vệ răng miệng toàn diện. 
Giúp bảo vệ răng miệng toàn diện. Trên thực tế, có nhiều vùng trong khoang miệng mà chỉ chải răng sẽ khó làm sạch được, đồng thời việc chải răng cũng không thể diệt sạch hoàn toàn vi khuẩn gây hôi miệng. Bạn cần sử dụng nước súc miệng Listerine Cool Mint vừa giúp ngừa mảng bám, vừa giúp giảm thiểu hôi miệng. Cho bạn tự tin với hơi thở thơm mát và hàm răng trắng sáng tạng rỡ.
Chai lớn 750ml khuyên dùng cho cả gia đình, giúp tiết kiệm thời gian và chi phí mua sắm. Listerine – Bảo vệ sức khỏe răng miệng toàn diện.
Listerine Cool Mint là nước súc miệng hương bạc hà mát lạnh không những có khả năng loại bỏ vi khuẩn gây hôi miệng, cho bạn hơi thở thơm tho, tươi mát mà còn cho bạn cảm giác mát lạnh thật sảng khoái sau khi sử dụng.
Diệt sạch vi khuẩn gây chứng hôi miệng, bảo vệ răng miệng suốt 24h, cho bạn cảm giác tự tin khi tiếp xúc với mọi người xung quanh.
Thành phần Sodium Flouride giúp loại bỏ vi khuẩn có hại cho nướu và gây ra các bệnh răng miệng, giúp hơi thở thơm tho.
Nước súc miệng giúp loại bỏ mảng bám, cao răng hiệu quả. Đồng thời có tác dụng làm trắng răng, ngăn ngừa sâu răng.
Nước súc miệng không chỉ mang đến cho bạn hơi thở thơm tho mà còn giúp bảo vệ răng, nướu chắc khỏe, trắng sáng đầy tự tin.
Nước súc miệng có hương bạc hà the mát tự nhiên cho cảm giác mát lạnh, sảng khoái dài lâu.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(45, 120, N'Bộ Đôi TSUBAKI Phục Hồi Ngăn Rụng Tóc (490ml/chai)', 309000, 40, 1, N'images/tsubaki.jpg', N' Dầu gội phục hồi ngăn rụng tóc không chứa silicon, phù hợp với mọi loại da. Có tác dụng làm sạch và chăm sóc da đầu đồng thời cung cấp dưỡng chất phục hồi tóc hư tổn từ sâu bên trong, hiệu quả trong việc giảm thiểu tình trạng rụng tóc do hư tổn.
Dầu xả phục hồi ngăn rụng tóc giúp cải thiện tình trạng tóc xơ rối. Phục hồi hư tổn, ngăn tóc rụng do hư tổn và cung cấp độ ẩm duy trì sự bóng mượt từ gốc đến ngọn.
Hiệu quả tức thì như dưỡng tóc ở salon mà không mất thời gian chờ đợi.
Sản phẩm chăm sóc tóc cao cấp giúp ngăn rụng tóc và phục hồi hư tổn từ gốc đến ngọn nhờ công nghệ thẩm thấu độc quyền của Shiseido, dưỡng chất hấp thu nhanh và sâu vào trong tóc qua cơ chế.
Mở rộng đường dẫn dưỡng chất vào tóc
Dưỡng chất thiết yếu (thành phần phục hồi + thành phần nuôi tóc bóng mượt) dễ dàng di chuyển và thấm sâu vào biểu bì tóc. Thành phần Dual Amino Acid giúp khép và khoác chặt dưỡng chất nuôi dưỡng bên trong tóc.
Công thức phục hồi tiên tiến vượt bậc và các thành phần giàu dưỡng chất thấm sâu giúp mái tóc suôn mượt và mềm mại.')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(47, 130, N'Thanh Lăn Lạnh Face & Body Ice Cooler Emmié By HappySkin', 398000, 25, 1, N'images/caylanlanh.jpg', N'Hỗ trợ se khít lỗ chân lông và săn chắc da hiệu quả.
Hướng dẫn sử dụng:
Cho cây lăn lạnh vào ngăn đá tủ lạnh 2 tiếng, sau đó lấy ra để ngoài khoảng 15 giây rồi dùng đầu kim loại massage nâng cơ theo chiều từ trong ra ngoài, từ dưới lên.
Xuất xứ: Hàn Quốc')

INSERT INTO Products(ProductID, CategoryID, ProductName, Price, Amount, SellID, Images, [Description])
VALUES(50, 130, N'Lược gội đầu Silicone Muji Nhật Bản - Massage xa da đầu', 85000, 60, 1, N'images/luoc.jpg', N'Lược gội đầu silicone Muji Nhật Bản chống gãy rụng tóc, gỡ rối giúp tóc suôn mượt, kích thích mọc tóc. 
Răng lược thiết kế thúc đẩy tuần hoàn máu tốt hơn (có thể dùng lược gội đầu chải tóc trước khi đi ngủ để có giấc ngủ ngon hơn) . 
Thiết kế tinh tế nhỏ gọn, hữu dụng. Đầu lược silicon bằng chất liệu PP và TPE an toàn, không gây hại da đầu.
Gai lược được làm từ cao su silicon mềm mại để tránh làm tổn thương da đầu và chống thấm nước, rất bền. 
Nhanh chóng loại bỏ những cặn bã như gàu (rụng tóc ,da dầu) và các tế bào chết trên da, không làm tổn thương da đầu nhờ thiết kế đặc biệt.')


INSERT INTO News(NewsID, Title, Content)
VALUES(322, N'CHU TRÌNH SKINCARE TỐI GIẢN CHO NÀNG MỚI TẬP TÀNH', N'Bước 1: Làm sạch da thường xuyên'+ CHAR(13)+
N'Trong mọi chu trình skincare thì bước làm sạch da vô cùng quan trọng, giúp lấy đi bụi bẩn tồn đọng và giúp da được thông thoáng hơn. Bên cạnh đó còn hỗ trợ cho các bước dưỡng da tiếp theo thuận lợi hơn.'+ CHAR(13)+
N'Bước 2: Dùng toner cấp ẩm'+ CHAR(13)+
N'Sau khi làm sạch da bạn nên chọn một dòng toner phù hợp với làn da bạn, ngoài việc cấp ẩm ẻm còn giúp làm sạch và dịu da nhanh chóng.'+ CHAR(13)+
N'Bước 3: Chọn serum da cần'+ CHAR(13)+
N'Hãy tìm hiểu làn da của bạn, phân biệt loại da và tình trạng da đang gặp phải để có thể lựa chọn serum đúng cách.'+ CHAR(13)+
N'Bước 4: Khoá lại chu trình bằng kem dưỡng'+ CHAR(13)+
N'Sau các bước, da cần dưỡng ẩm hoặc cung cấp các chất dinh dưỡng cần thiết. Vẫn hãy chọn cho da một dòng sản phẩm phù hợp, để da luôn khoẻ mạnh.')

INSERT INTO News(NewsID, Title, Content)
VALUES(333, N'TIPS MAKEUP CỰC XINH CHO CÔ NÀNG KÍNH CẬN', N'1. Che khuyết điểm mắt'+ CHAR(13)+
N'Đối với những cô nàng kính cận, những khuyết điểm lân cận vùng mắt là thực sự rất cần để che chắn cho thật tốt. Vì cặp mắt kính sẽ làm hiện rõ những quầng thâm, nét nhăn hay bất kì vùng da nào không hoàn hảo ở phía dưới mắt.
Việc sử dụng kem che khuyết điểm sẽ giúp đôi mắt kính cận xinh tươi và rạng rỡ hơn rất nhiều.'+ CHAR(13)+
N'2.Chọn gam màu tươi tắn'+ CHAR(13)+
N'Việc chọn lựa màu phấn mắt sao cho hợp lí cũng không đơn giản. Nếu bạn là một cô gái tự tin và thích sự nổi bật,bạn nên chọn phấn mắt đối lập với màu sắc của gọng kính.
Có thể chọn các gam nổi bật để che lấp đi các quầng thâm trên mắt, làm cho gương mặt trở nên rạng rỡ đầy sức sống hơn.'+ CHAR(13)+
N'3. Tạo thêm điểm nhấn'+ CHAR(13)+
N'Đây là cách làm đặc biệt quan trọng dành cho “4 mắt”, vì khi đeo kính, đôi lông mày trên khuôn mặt là điểm thu hút, nó có tính quyết định sự nổi bật toàn diện của khuôn mặt. 
Vậy nên, lời khuyên chân thành dành cho nàng “4 mắt” là cắt tỉa lông mày sao cho thật gọn gàng kết hợp thêm kẻ lông mày hợp với hình dáng đôi mắt và khuôn mặt.')

INSERT INTO News(NewsID, Title, Content)
VALUES(344, N'TOP 4 KEM CHỐNG NẮNG GIÁ RẺ DƯỚI 200K DÀNH CHO HS - SV', N'1.BIO-ESSENCE KEM CHỐNG NẮNG BIO WATER HYDRATING SUNSCREEN SPF50+ PA++ (40ML)'+ CHAR(13)+
N'Chỉ số chống nắng SPF50+/PA++ giúp bảo vệ da trước tác hại của tia UVA và UVB từ ánh nắng mặt trời. Giúp nhanh chóng làm dịu mát làn da.'+ CHAR(13)+
N'2. BIORE UV AQUA RICH WATERY ESSENCE SPF50+/PA++++ 50G'+ CHAR(13)+
N'Khả năng chống nắng kép mạnh mẽ và hiệu quả với chỉ số SPF50+/PA+++ giúp bảo vệ da trước sự tấn công các tia tử ngoại có hại. Chứa Sodium Hyaluronate (muối của Hyaluronic Acid) giúp dưỡng ẩm và giảm thiểu tình trạng da khô mất nước.'+ CHAR(13)+
N'3.SUNPLAY SKIN AQUA TONE UP UV ESSENCE 50G '+ CHAR(13)+
N'Chống nắng hiệu quả với chỉ số SPF50+, PA++++ bảo vệ làn da trước tia UV gây hại. Thành phần dưỡng ẩm Hyaluronic Acid giúp duy trì độ ẩm tự nhiên, kết hợp Vitamin C dưỡng da sáng mịn.'+ CHAR(13)+
N'4.KEM CHỐNG NẮNG TRẮNG DA CATHY DOLL L-GLUTATHIONE MAGIC CREAM SPF50 PA+++ 60MLL'+ CHAR(13)+
N'Chứa hoạt chất Glutathione đậm đặc tới 30%, nhiều hơn bình thường gấp 5 lần cùng với tinh chất Whitening + Pore Tightening giúp da trắng sáng, se khít lỗ chân lông, giảm các vết thâm, xỉn màu hiệu quả.')

INSERT INTO News(NewsID, Title, Content)
VALUES(355, N'ĐỂ LÀN DA KHÔNG BỊ HANH KHÔ KHI TRỜI CHUYỂN LẠNH', N'ĐỪNG QUÊN DÙNG KEM CHỐNG NẮNG'+ CHAR(13)+CHAR(10) +
N'Dù trời nắng hay trời râm mát, bạn vẫn luôn nhớ đến việc sử dụng đủ đúng liều lượng chống nắng để bảo vệ làn da toàn diện. Các tia UV luôn tồn tại và gây hại cho làn da, vậy nên việc "mặc giáp" cho da là điều vô cùng quan trọng.'+ CHAR(13)+
N'LUÔN NHỚ LÀM SẠCH DA'+ CHAR(13)+
N'Trời lạnh hơn cũng khiến bạn ngại rửa mặt hơn vì sợ lạnh hay vì cảm giác da không tiết ra dầu nhờn. Tuy nhiên bạn vẫn nên làm sạch da thường xuyên, vì tiếp xúc với môi trường da vẫn chịu ảnh hưởng bởi khói bụi, ô nhiễm.'+ CHAR(13)+
N'CẤP ẨM ĐỦ CHO DA'+ CHAR(13)+
N'Da khô hanh và dễ nứt nẻ hơn vào những ngày trời chuyển lạnh. Càng nghiêm trọng hơn ở các bạn da khô khi lượng ẩm trên da không được cung cấp đủ. Vậy nên bạn nên thay đổi chu trình skincare phù hợp, chọn các sản phẩm mang tính cấp nước nhiều hơn.'+ CHAR(13)+
N'BỔ SUNG THÊM CÁC DƯỠNG CHẤT'+ CHAR(13)+
N'Bên cạnh đó, sau một ngày làm việc mỏi mệt da cần được bổ sung thêm năng lượng từ trong ra ngoài. Một chiếc mặt nạ dưỡng chất giúp da cấp nước thêm cũng như giảm căng thẳng phục hồi da.
Bổ sung thêm các thực phẩm chúc năng để làn da được nuôi dưỡng trọn vẹn, không còn gặp các vấn đề khô hanh mùa lạnh nữa.')
