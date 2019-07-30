<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>게시판 페이지</title>
    <!-- css 가져오기 -->
    <link rel="stylesheet" type="text/css" href="/resources/semantic.min.css">

    <style type="text/css">
        body {
            background-color: #DADADA;
        }

        body>.grid {
            height: 100%;
        }

        .image {
            margin-top: -100px;
        }

        .column {
            max-width: 1000px;
        }

        .view_btn {
            cursor: pointer;
        }

    </style>
</head>

<body>
    <div class="ui middle aligned center aligned grid">
        <div class="column">
            <h2 class="ui teal image header">
                게시판 페이지
            </h2>
            <div class="ui large form">
                <div class="ui stacked segment">
                   <input type ="button" id="btn_write" class="ui fluid large teal button" value="게시글 쓰기"/>
                   <div id="writeArea" class="ui middle aligned center aligned" style="width:100%; display:none;">
			            <form class="ui large form">
			                <div class="ui stacked segment">
			                    <div class="field">
			                        <input type="text" id="b_title" placeholder="게시글 제목" autocomplete="off" autofocus="autofocus">
			                    </div>
			                    <div class="field">
			                        <div class="ui left icon input">
			                            <textarea style="resize: vertical;" id="b_content" placeholder="게시글 내용" rows="8"></textarea>
			                        </div>
			                    </div>
			                    <div class="ui fluid large teal submit button" id="write_bbs">저장</div>
			                </div>
			            </form>
		            </div>
                   <table class="ui celled table">
                        <thead>
                        <c:forEach var="list" items="${list}" varStatus="status">
							 <tr>
                                <th>${list.postSeq}</th>
                                <th>${list.regId}</th>
                                <th>${list.title}</th>
                                <th>${list.content}</th>
                            </tr>
						</c:forEach>
                        </thead>
                    </table>
                </div>

                <div class="ui error message"></div>

            </div>
        </div>
    </div>

    <div class="ui modal" id='view_modal'>
        <i class="close">x</i>
        <div class="header" id="b_title">
            
        </div>
        <div class="content">
            <div class="description">
            	<p style = "text-align: right" id = "b_review"></p>
            	<div id = 'b_content'></div>
            </div>
        </div>
        <div class="actions">
            <div class="ui black deny button">
                닫기
            </div>
        </div>
    </div>
    <!-- js 가져오기 -->
    <script src="/resources/jquery3.3.1.min.js"></script>
    <script src="/resources/semantic.min.js"></script>

    <script>
	$(document).ready(function() {
		$('#btn_write').click(function(){
		    //$('#writeArea').attr('style','display:block');
		    $('#writeArea').toggle();
		  });
	
	});

    </script>
</body>

</html>
