/*
 *  分页js
 * 
 */
function initPageDiv(_pagecur, _pagecount) {

	$(".pagination4div").empty();
	/*
	 * 当前页码=1
	 */
	var _divStr = "";
	if (_pagecur == 1) {
		_divStr += "<ul class=\"pagination\">";
		if (_pagecount >= 10) {
			for (var i = 1; i <= 10; i++) {
				if (i == _pagecur) {
					_divStr += "<li class=\"active\"><a href=\"#\">" + i
							+ "</a></li>";
				} else {
					_divStr += "<li><a href=\"#\">" + i + "</a></li>";
				}
			}
		} else {
			for (var i = 1; i <= _pagecount; i++) {
				if (i == _pagecur) {
					_divStr += "<li class=\"active\"><a href=\"#\">" + i
							+ "</a></li>";
				} else {
					_divStr += "<li><a href=\"#\">" + i + "</a></li>";
				}
			}
		}
		_divStr += "<li><a href=\"#\">&raquo;</a></li>";
		_divStr += "</ul>";
	} else if (_pagecur != 1) {
		_divStr += "<ul class=\"pagination\">";
		_divStr += "<li><a href=\"#\">&laquo;</a></li>";
		if (_pagecur - 1 <= 5) {
			for (var i = 1; i <= 10; i++) {
				if (i == _pagecur) {
					_divStr += "<li class=\"active\"><a href=\"#\">" + i
							+ "</a></li>";
				} else {
					_divStr += "<li><a href=\"#\">" + i + "</a></li>";
				}
			}
		} else {
			for (var i = _pagecur - 5; i <= pagecur + 4; i++) {
				if (i == _pagecur) {
					_divStr += "<li class=\"active\"><a href=\"#\">" + i
					+ "</a></li>";
				} else {
					_divStr += "<li><a href=\"#\">" + i + "</a></li>";
				}
			}
		}
		_divStr += "<li><a href=\"#\">&raquo;</a></li>";
		_divStr += "</ul>";
	}
	$(".pagination4div").append(_divStr);
}
