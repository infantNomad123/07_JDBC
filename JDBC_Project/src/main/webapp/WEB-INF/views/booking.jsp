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
        인원 수 : <input type="number" name="perNum">
        <br><br>
        가격 : <b id = "price">${movie.price}</b>
        총 : <b></b>
    </form>
    <br>
    <button> 예매하기</button>
    
    
</body>
<script src = "/resources/js/booking.js"></script>
</html>