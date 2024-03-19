<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ODEON MOVIE RESERVATION SYSTEM</title>
</head>
<body>
    <h1>ODEON MOVIE RESERVATION SYSTEM</h1>
    
    <form action="/project/search">
        <input type="text" placeholder = "search" name="keyword">
        <button>search</button><br><br>
    </form>
   
    
    
        <table border = "1">
            <thead>
                <tr>
                    <th>영화 이름</th>
                    <th>가격</th>
                    <th>레이팅</th>
                    <th>SR_NO</th>
                    
                </tr>
            </thead>

            <tbody>
			<c:forEach items = "${movies}" var = "movie" >
				<tr>
					<%--vs.count : 현재 반복 횟수 (1부터 시작) --%>
					
					<td><a href = "/project/booking?srNo=${movie.sr_no}">${movie.name}</a></td>
					<td>${movie.price}</td>
					<td>${movie.ratings}</td>
					<td>${movie.sr_no}</td>

				</tr>
			</c:forEach>
		</tbody>
        </table>
         <script>
         const button = document.querySelector("button");
         button.addEventListener("click" , () => {
             a.href.location = "/project/search?name=" + ${name};
         });
           
        </script>
        
        
</body>
</html>