<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�޴� ����</title>
</head>
<body>
<form method="get" action="Menu">
	
	  <label><input type="radio" name="choice" value="allMenu">�޲ٹ� ����</label>
      <label><input type="radio" name="choice" value="addMenu">ġ�� ������</label>
      <label><input type="radio" name="choice" value="modifyMenu">����</label>
      <label><input type="radio" name="choice" value="modifyMenu">���� </label>
      <label><input type="radio" name="choice" value="deleteMenu">�ֹ� ����</label>
      
      <p>
      	<input type="submit" value="Submit"> <input type="reset" value="Reset">
      </p>
    </form>

</body>
</html>