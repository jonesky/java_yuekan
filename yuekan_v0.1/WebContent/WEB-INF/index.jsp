<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
		<meta name="viewport" content="width=device-width, initial-scale=1"> 
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<link rel="stylesheet" type="text/css" href="css/content.css" />
		<script src="js/modernizr.custom.js"></script>
		<style type="text/css">
			.a{
				display: block;
				margin-top: 2.5em;
				padding: 1.5em;
				width: 100%;
				border: none;
				background: #e75854;
				color: #f9f6e5;
				text-transform: uppercase;
				letter-spacing: 1px;
				font-weight: 800;
				font-size: 1.25em;
			}
		</style>
		
		
		
	</head>
	<body>
		<div class="container">
			<header class="codrops-header">
				<h1>阅 看 商 品 查 询 系 统</h1>
				<p>欢迎使用 阅看商品查询系统 本系统由 胡亚洲 刘鹏搏 尹博亚 共同开发完成</p>
				<nav class="codrops-demos">
					<hr/>
				</nav>
			</header>
			<div align="center">用户: ${member.userName}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="list.do" >我的查询</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="exit.do" >退出</a></div>
			<section>
				<p>我们为更好的 <strong>商品购买</strong> 提供服务</p>
				<div class="mockup-content">
					<div class="morph-button morph-button-modal morph-button-modal-2 morph-button-fixed">
						<button type="button">商品号</button>
						<div class="morph-content">
							<div>
								<div class="content-style-form content-style-form-1">
									<span class="icon icon-close">Close the dialog</span>
									<h2>商品号查询</h2>
									<form action="query1.do" method="post">
										<p><label>商品号</label><input type="text" name="goodsId"/></p>
										<p><input type="submit" class="a" name="submit" value="查询 "/></p>
									</form>
								</div>
							</div>
						</div>
					</div><!-- morph-button -->
					<!-- <strong class="joiner">or</strong> -->
					<div class="morph-button morph-button-modal morph-button-modal-3 morph-button-fixed">
						<button type="button">商品URL</button>
						<div class="morph-content">
							<div>
								<div class="content-style-form content-style-form-2">
									<span class="icon icon-close">Close the dialog</span>
									<h2>商品URL查询</h2>
									<form action="query3.do" method="POST">
										<p><label>商品URL</label><input type="text" name="goodsURL"/></p>
										<p><input type="submit" class="a" name="submit" value="查询 "/></p>
									</form>
								</div>
							</div>
						</div>
					</div><!-- morph-button -->
					<!-- <strong class="joiner">or</strong> -->
					<div class="morph-button morph-button-modal morph-button-modal-3 morph-button-fixed">
						<button type="button">详细URL</button>
						<div class="morph-content">
							<div>
								<div class="content-style-form content-style-form-2">
									<span class="icon icon-close">Close the dialog</span>
									<h2>URL查询</h2>
									<form action="query2.do" method="POST">
										<p><label>商品URL</label><input type="text" name="goodsURL"/></p>
										<p><label>评论URL</label><input type="text" name="evaluateURL"/></p>
										<p><input type="submit" class="a" name="submit" value="查询 "/></p>
									</form>
								</div>
							</div>
						</div>
					</div><!-- morph-button -->
					<p>Kohlrabi radish okra azuki bean corn fava bean mustard tigernut juccama green bean celtuce collard greens avocado quandong.</p>
				</div><!-- /form-mockup -->
			</section>
		</div><!-- /container -->
		<script src="js/classie.js"></script>
		<script src="js/uiMorphingButton_fixed.js"></script>
		<script>
			(function() {
				var docElem = window.document.documentElement, didScroll, scrollPosition;

				// trick to prevent scrolling when opening/closing button
				function noScrollFn() {
					window.scrollTo( scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0 );
				}

				function noScroll() {
					window.removeEventListener( 'scroll', scrollHandler );
					window.addEventListener( 'scroll', noScrollFn );
				}

				function scrollFn() {
					window.addEventListener( 'scroll', scrollHandler );
				}

				function canScroll() {
					window.removeEventListener( 'scroll', noScrollFn );
					scrollFn();
				}

				function scrollHandler() {
					if( !didScroll ) {
						didScroll = true;
						setTimeout( function() { scrollPage(); }, 60 );
					}
				};

				function scrollPage() {
					scrollPosition = { x : window.pageXOffset || docElem.scrollLeft, y : window.pageYOffset || docElem.scrollTop };
					didScroll = false;
				};

				scrollFn();

				[].slice.call( document.querySelectorAll( '.morph-button' ) ).forEach( function( bttn ) {
					new UIMorphingButton( bttn, {
						closeEl : '.icon-close',
						onBeforeOpen : function() {
							// don't allow to scroll
							noScroll();
						},
						onAfterOpen : function() {
							// can scroll again
							canScroll();
						},
						onBeforeClose : function() {
							// don't allow to scroll
							noScroll();
						},
						onAfterClose : function() {
							// can scroll again
							canScroll();
						}
					} );
				} );

				// for demo purposes only
				[].slice.call( document.querySelectorAll( 'form button' ) ).forEach( function( bttn ) { 
					bttn.addEventListener( 'click', function( ev ) { ev.preventDefault(); } );
				} );
			})();
		</script>
	</body>
</html>