/**
 * 
 */
$(function () {
	$('#addForm').validate({
	    rules: {                    // 유효성 검사 규칙
			questioner: {
	            required: true,     // 필수 입력
	            minlength : 2       // 최소 입력 길이
	        },
			question: {
	            required: true,     // 필수 입력
	            minlength : 2       // 최소 입력 길이
	        },
			answer: {
				required: true,     // 필수 입력
				minlength : 2       // 최소 입력 길이
			},
			answerer: {
				required: true,     // 필수 입력
				minlength : 2       // 최소 입력 길이
			}
	    },
	    messages: {                 // 오류값 발생시 출력할 메시지 수동 지정
			answer: {
	            required: '필수 입력 항목입니다.',
	            minlength: '최소 {0}글자 이상 입력하세요.'
	        },
			answerer: {
	            required: '필수 입력 항목입니다.',
	            minlength: '최소 {0}글자 이상 입력하세요.'
	        }
	    }
	});
})