<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<script src="static/plugins/jquery/jquery-1.12.2.js"></script>

<link href="static/plugins/kindeditor/themes/default/default.css"
	rel="stylesheet" />
<link href="static/plugins/kindeditor/plugins/code/prettify.css"
	rel="stylesheet" />
<script src="static/plugins/kindeditor/kindeditor-all-min.js"></script>
<script src="static/plugins/kindeditor/lang/zh-CN.js"></script>
<script src="static/plugins/kindeditor/plugins/code/prettify.js"></script>
<script src="static/common/CommonFunction.js"></script>
<!--分页插件-->
<link href="static/plugins/jQueryPager/jquery.page.css" rel="stylesheet" />
<script src="static/plugins/jQueryPager/jquery.page.js"></script>
<!--jbox插件-->

<div>	
	<div id="" style="margin-left:10%;">
		<div id="text_area_div">			
			<div id="input_id_div">				
				<form>
					<textarea id="common_input_text_area" name="note_content"
						style="width:80%;height:200px;"></textarea>
				</form>
				<div style="width:80%;">
					<input type="button" id="common_submit" value="提交留言"
						style="float:right;" /> <a onclick="refreshTable('1')"
						style="float:right;margin-right:20px;font-size:20px;">刷新</a>
				</div>

			</div>

			<div id="main_comment_container_div"></div>
			<br />
			<hr />
			<div id="footer_pager_div"></div>
			<br /> <br />

		</div>
	</div>
	<style type="text/css">
#main_comment_container_div {
	width: 80%;
	height:500px;
	
}

div.comment-content-div {
	width: 80%;
	border: solid;
	border-width: 1px;
	border-radius: 5px;
	word-wrap: break-word;
	padding: 5px;
}
</style>
</div>