<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="qna 수정 페이지입니다.">
    <!-- 	tailwind cdn  -->
    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <!-- 	개발자가 만든 css -->
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/validation-error.css">

</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container mx-auto mt-8 px-3">
    <h1 class="text-2xl font-bold mb-6">qna 상세조회</h1>
    <form id="addForm" name="addForm" method="post">

        <input type="hidden" id="qno" name="qno" value="<c:out value="${qna.qno}"/>" />
        <div class="mb-4">
            <label for="title" class="block mb-1">questioner</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="questioner"
                   name="questioner"
                   value="<c:out value="${qna.questioner}"/>"
                   placeholder="제목">
        </div>
        <div class="mb-4">
            <label for="content" class="block mb-1">question</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="question"
                   name="question"
                   value="<c:out value="${qna.question}"/>"
                   placeholder="내용">
        </div>
        <div class="mb-4">
            <label for="title" class="block mb-1">answer</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="answer"
                   name="answer"
                   value="<c:out value="${qna.answer}"/>"
                   placeholder="제목">
        </div>
        <div class="mb-4">
            <label for="content" class="block mb-1">answerer</label>
            <input type="text"
                   class="w-full border border-gray-300 rounded p-2 focus:outline-none focus:ring focus:ring-blue-500"
                   id="answerer"
                   name="answerer"
                   value="<c:out value="${qna.answerer}"/>"
                   placeholder="내용">
        </div>
        <div class="mb-4 flex gap-2">
            <button type="button"
                    class="flex-1 bg-green-700 text-white p-2 rounded hover:bg-green-800"
                    onclick="fn_save()"
            >
                수정
            </button>
            <button type="button"
                    class="flex-1 bg-red-600 text-white p-2 rounded hover:bg-red-700"
                    onclick="fn_delete()"
            >
                삭제
            </button>
        </div>
    </form>
</div>
<!-- jquery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!-- 유효성체크 플러그인 -->
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.21.0/dist/jquery.validate.min.js"></script>
<script src="/js/qna/qna-validation-config.js"></script>

<script type="text/javascript">
    function fn_save() {
        $("#addForm").attr("action",'/qna/edit')
            .submit();
    }

    function fn_delete() {
        $("#addForm").attr("action",'/qna/delete')
            .submit();
    }
</script>

</body>
</html>
