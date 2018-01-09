$.extend({
    remotePost: function(data,url) {
    	$.ajax({ 
    	    type:"post", 
    	    data:data, 
    	    url:url, 
    	    dataType:"jsonp", 
    	    jsonp:"callback", 
    	    success:function(data){ 
    	    	if(undefined  == data.pageinfo){
    	    		
    	    	}else{
    	    		var _page = data.pageinfo;
    	    		var _pagenum = _page.pagenum;
    	    		var _pagecur = _page.pagecur;
    	    		var _totalnum = _page.totalnum;
    	    		var _pagecount = _page.pagecount;
    	    		
    	    		initPageDiv(_pagecur,_pagecount);
    	    		fillTable(data.list);
    	    	}
    	    } 
    	});
    }
})
