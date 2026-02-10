<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="사원 추가 페이지입니다.">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자 css -->
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>


<div class="container mx-auto mt-8 px-3">
    <h1 class="text-2xl font-bold mb-6">사원 추가</h1>
    <form id="addForm" name="addForm" method="post">

        <div class="mb-4">
            <label for="ename" class="block mb-1">ename</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="ename"
                   placeholder="사원명">
        </div>
        <div class="mb-4">
            <label for="job" class="block mb-1">job</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="job"
                   placeholder="직위">
        </div>
        <div class="mb-4">
            <label for="manager" class="block mb-1">manager</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="manager"
                   placeholder="관리자사원번호">
        </div>
        <div class="mb-4">
            <label for="hiredate" class="block mb-1">hiredate</label>
            <input type="date"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="hiredate"
                   placeholder="입사일">
        </div>
        <div class="mb-4">
            <label for="salary" class="block mb-1">salary</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="salary"
                   placeholder="급여">
        </div>
        <div class="mb-4">
            <label for="commission" class="block mb-1">commission</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="commission"
                   placeholder="상여금">
        </div>
        <div class="mb-4">
            <label for="job" class="block mb-1">job</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="job"
                   placeholder="직위">
        </div>
        <div class="mb-4">
            <label for="dno" class="block mb-1">dno</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="dno"
                   placeholder="부서번호">
        </div>
        <div class="mb-4">
            <button type="button"
                    class="w-full bg-blue-700 text-white p-2 rounded hover:bg-blue-800"
            >저장
            </button>
        </div>
    </form>
</div>

</body>
</html>
