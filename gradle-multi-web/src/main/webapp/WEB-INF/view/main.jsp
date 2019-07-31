<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>POST</title>
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
                POST
            </h2>
            <div id="controllArea" style="float:right;">
	            <input type ="button" id="btn_list" class="ui fluid small teal button" value="List"/>
	            <input type ="button" id="btn_bookmark" class="ui fluid small teal button" value="BookMark"/>
            </div>
            <div class="ui large form">
                <div class="ui stacked segment">
                   <input type ="button" id="btn_write" class="ui fluid large teal button" value="WIRTE"/>
                   <div id="writeArea" class="ui middle aligned center aligned" style="width:100%; display:none;">
			            <form class="ui large form" id="writeForm">
			                <div class="ui stacked segment">
			                    <div class="field">
			                        <input type="text" id="title" name="title" placeholder="post title" autocomplete="off" autofocus="autofocus">
			                    </div>
			                    <div class="field">
			                        <div class="ui left icon input">
			                            <textarea style="resize: vertical;" name="content" id="content" placeholder="post contents" rows="8"></textarea>
			                        </div>
			                    </div>
			                    <div class="ui fluid large teal submit button" id="btn_save">save</div>
			                </div>
							<!-- Hidden Section -->
							<input type="hidden" name="regId" id="regId" value="jsg"/>
							<input type="hidden" name="regNm" id="regNm" value="주상곤"/>
							<input type="hidden" name="boardId" id="boardId" value="00001"/>
							<!-- Hidden Section -->
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

		$('#btn_save').click(function(){
			$( "#writeForm" ).attr('method','POST');
			$( "#writeForm" ).attr('action','/post/save');
			$( "#writeForm" ).submit();
	  	});
			
	});

    </script>
</body>

</html>
