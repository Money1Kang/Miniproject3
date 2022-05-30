<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레시피</title>
</head>
<body>
	<form method="get" action="Menu">
	
	  <label><input type="radio" name="choice" value="allMenu">주문 조회</label>
      <label><input type="radio" name="choice" value="addMenu">주문 추가</label>
      <label><input type="radio" name="choice" value="modifyMenu">주문 수정</label>
      <label><input type="radio" name="choice" value="deleteMenu">주문 삭제</label>
      
      <p>
      	<input type="submit" value="Submit"> <input type="reset" value="Reset">
      </p>
    </form>
</body>
</html>