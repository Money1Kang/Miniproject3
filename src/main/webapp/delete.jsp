<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메뉴 삭제</title>
</head>
<body>
<form method="get" action="Menu">
	
	  <label><input type="radio" name="choice" value="allMenu">쭈꾸미 삼겹살</label>
      <label><input type="radio" name="choice" value="addMenu">치즈 볶음밥</label>
      <label><input type="radio" name="choice" value="modifyMenu">소주</label>
      <label><input type="radio" name="choice" value="modifyMenu">맥주 </label>
      <label><input type="radio" name="choice" value="deleteMenu">주문 삭제</label>
      
      <p>
      	<input type="submit" value="Submit"> <input type="reset" value="Reset">
      </p>
    </form>

</body>
</html>