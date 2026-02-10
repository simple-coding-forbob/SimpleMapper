<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="사원 수정 페이지입니다.">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container mx-auto mt-8 px-3">
    <h1 class="text-2xl font-bold mb-6">사원 상세조회</h1>
    <form id="addForm" name="addForm">

        <div class="mb-4">
            <label for="ename" class="block mb-1">ename</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="ename"
                   name="ename"
                   value=""
                   placeholder="사원명">
        </div>
        <div class="mb-4">
            <label for="job" class="block mb-1">job</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="job"
                   name="job"
                   value=""
                   placeholder="직위">
        </div>
        <div class="mb-4">
            <label for="manager" class="block mb-1">manager</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="manager"
                   name="manager"
                   value=""
                   placeholder="관리자사원번호">
        </div>
        <div class="mb-4">
            <label for="hiredate" class="block mb-1">hiredate</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="hiredate"
                   name="hiredate"
                   value=""
                   placeholder="입사일">
        </div>
        <div class="mb-4">
            <label for="salary" class="block mb-1">salary</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="salary"
                   name="salary"
                   value=""
                   placeholder="급여">
        </div>
        <div class="mb-4">
            <label for="commission" class="block mb-1">commission</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="commission"
                   name="commission"
                   value=""
                   placeholder="상여금">
        </div>
        <div class="mb-4">
            <label for="dno" class="block mb-1">dno</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="dno"
                   name="dno"
                   value=""
                   placeholder="부서번호">
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
