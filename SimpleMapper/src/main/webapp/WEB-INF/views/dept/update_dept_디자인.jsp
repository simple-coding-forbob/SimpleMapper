<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="부서 수정 페이지입니다.">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<%--머리말--%>
<div class="container mx-auto mt-8 px-3">
    <h1 class="text-2xl font-bold mb-6">부서 상세조회</h1>
    <form id="addForm" name="addForm">

        <div class="mb-4">
            <label for="dname" class="block mb-1">dname</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="dname"
                   value=""
                   placeholder="부서명">
        </div>
        <div class="mb-4">
            <label for="loc" class="block mb-1">loc</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="loc"
                   value=""
                   placeholder="부서위치">
        </div>
        <div class="mb-4 flex gap-2">
            <button type="button"
                    class="flex-1 bg-green-700 text-white p-2 rounded hover:bg-green-800"
            >
                수정
            </button>
            <button type="button"
                    class="flex-1 bg-red-600 text-white p-2 rounded hover:bg-red-700"
            >
                삭제
            </button>
        </div>
    </form>
</div>


</body>
</html>
