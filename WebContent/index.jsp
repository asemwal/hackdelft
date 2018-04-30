<!doctype html>
<head>
	<meta charset="utf-8">
	<title>HTML5 Sortable jQuery Plugin</title>
	<style>
		header, section {
			display: block;
		}
		body {
			font-family: 'Droid Serif';
		}
		h1, h2 {
			text-align: center;
			font-weight: normal;
		}
		#features {
			margin: auto;
			width: 460px;
			font-size: 0.9em;
		}
		.connected, .sortable, .exclude, .handles {
			margin: auto;
			padding: 0;
			width: 310px;
			-webkit-touch-callout: none;
			-webkit-user-select: none;
			-khtml-user-select: none;
			-moz-user-select: none;
			-ms-user-select: none;
			user-select: none;
		}
		.sortable.grid {
			overflow: hidden;
		}
		.connected li, .sortable li, .exclude li, .handles li {
			list-style: none;
			border: 1px solid #CCC;
			background: #F6F6F6;
			font-family: "Tahoma";
			color: #1C94C4;
			margin: 5px;
			padding: 5px;
			height: 22px;
		}
		.handles span {
			cursor: move;
		}
		li.disabled {
			opacity: 0.5;
		}
		.sortable.grid li {
			line-height: 80px;
			float: left;
			width: 80px;
			height: 80px;
			text-align: center;
		}
		li.highlight {
			background: #FEE25F;
		}
		#connected {
			width: 440px;
			overflow: hidden;
			margin: auto;
		}
		.connected {
			float: left;
			width: 200px;
		}
		.connected.no2 {
			float: right;
		}
		li.sortable-placeholder {
			border: 1px dashed #CCC;
			background: none;
		}
	</style>
	<link href='http://fonts.googleapis.com/css?family=Droid+Serif' rel='stylesheet' type='text/css'>
</head>

<body>
	<header>
		<h1>HTML5 Sortable jQuery Plugin</h1>
	</header>
	<section>
		<h2>Features</h2>
		<ul id="features">
			<li>Less than 1KB (minified).
			<li>Built using native HTML5 drag and drop API.</li>
			<li>Supports both list and grid style layouts.</li>
			<li>Similar API and behaviour to jquery-ui sortable plugin.</li>
			<li>Works in IE 5.5+, Firefox 3.5+, Chrome 3+, Safari 3+ and, Opera 12+.</li>
		</ul>
	</section>
	<section>
		<h2>Sortable List</h2>
		<ul class="sortable list">
			<li>Item 1</li>
			<li>Item 2</li>
			<li>Item 3</li>
			<li>Item 4</li>
			<li>Item 5</li>
			<li>Item 6</li>
		</ul>
	</section>
	<section>
		<h2>Sortable Grid</h2>
		<ul class="sortable grid">
			<li>Item 1</li>
			<li>Item 2</li>
			<li>Item 3</li>
			<li>Item 4</li>
			<li>Item 5</li>
			<li>Item 6</li>
		</ul>
	</section>
	<section>
		<h2>Exclude Items</h2>
		<ul class="exclude list">
			<li>Item 1</li>
			<li>Item 2</li>
			<li>Item 3</li>
			<li class="disabled">Item 4</li>
			<li class="disabled">Item 5</li>
			<li class="disabled">Item 6</li>
		</ul>
	</section>
	<section>
		<h2>Sortable List With Handles</h2>
		<ul class="handles list">
			<li><span>::</span> Item 1</li>
			<li><span>::</span> Item 2</li>
			<li><span>::</span> Item 3</li>
			<li><span>::</span> Item 4</li>
			<li><span>::</span> Item 5</li>
			<li><span>::</span> Item 6</li>
		</ul>
	</section>
	<section id="connected">
		<h2>Connected Sortable Lists</h2>
		<ul class="connected list">
			<li>Item 1</li>
			<li>Item 2</li>
			<li>Item 3</li>
			<li>Item 4</li>
			<li>Item 5</li>
			<li>Item 6</li>
		</ul>
		<ul class="connected list no2">
			<li class="highlight">Item 1</li>
			<li class="highlight">Item 2</li>
			<li class="highlight">Item 3</li>
			<li class="highlight">Item 4</li>
			<li class="highlight">Item 5</li>
			<li class="highlight">Item 6</li>
		</ul>
	</section>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script src="jquery.sortable.js"></script>
	<script>
		$(function() {
			$('.sortable').sortable();
			$('.handles').sortable({
				handle: 'span'
			});
			$('.connected').sortable({
				connectWith: '.connected'
			});
			$('.exclude').sortable({
				items: ':not(.disabled)'
			});
		});
	</script>
</body>
</html>
