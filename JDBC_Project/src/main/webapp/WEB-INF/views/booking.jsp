<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${movie.name}</title>
</head>
   
<body>
 <h1>${movie.name}</h1>
    <form action="/project/booking" method = "GET" >
        인원 수 : <input type="number", id = "input"  , min = "1", max = "100">
        <br><br>
        가격 : <b id = "price" name = "price">${movie.price}</b><br>
        총 : <b id = "total" name = "total">0</b><br>
        인원: <b id = "persons" name = "person">0<b><br>
         
    </form>
    <br>
    <button id = "button"> 예매하기</button>
   
 
<script src = "/resources/js/booking.js" ></script>

 
</body>

</html>