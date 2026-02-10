<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="kr">
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="galley 조회 페이지입니다.">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<jsp:include page="/common/header.jsp"/>
<form class="container mx-auto mt-8 px-3" id="listForm" name="listForm">

    <!-- TODO: 컨트롤러로 보낼 페이지번호 -->
    <input type="hidden" id="page" name="page" value="0">
    <h1 class="text-2xl font-bold mb-6">galley 조회</h1>

    <div class="flex justify-center mb-4">
        <input type="text"
               class="w-full border border-gray-300 rounded-l p-2 focus:outline-none focus:ring focus:ring-blue-500"
               id="searchKeyword"
               name="searchKeyword"
               placeholder="제목입력"
        >
        <button type="button"
                class="bg-blue-700 text-white hover:bg-blue-800 px-4 py-2 rounded-r min-w-[5rem]"
        >
            검색
        </button>
    </div>
    <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-4">
        <!-- 카드 디자인: 반복문 -->
            <div class="border rounded shadow hover:shadow-md overflow-hidden">
                <img src="blank" loading="lazy" alt='이미지'
                     class="w-full h-48 object-cover">
                <div class="p-4">
                    <p class="text-gray-600">11</p>
                    <button class="px-2 py-1 bg-red-500 rounded text-white"
                    >삭제
                    </button>
                </div>
            </div>
    </div>

    <!-- 여기: 페이지번호 -->
    <div class="flex justify-center mt-4">
        <ul class="pagination" id="pagination"></ul>
    </div>
</form>

</body>
</html>
