<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search result for "${name}"</title>

    
        
        <table border = "1">
            <thead>
                <tr>
                    <th>영화 이름</th>
               
                    
                </tr>
            </thead>

            <tbody>
			
				<tr>
					<%--vs.count : 현재 반복 횟수 (1부터 시작) --%>
					
					<td><a href = "/project/booking?">${name}</a></td>
					

				</tr>
		
		</tbody>
        </table>
       
    
    </form>
</head>
<body>
    
</body>
</html>