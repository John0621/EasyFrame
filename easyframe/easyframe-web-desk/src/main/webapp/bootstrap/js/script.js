$(function() {
    // the global default ease in animation of the tab and popover
    var _easeIn = 'fadeInLeft';
    var _previewTabContent;
    var _previeweaseIn;

    enhanceTab($('#myTab1 a'), $('#tab-content1'));
    // enhanceTab($('#myTab2 a'), $('#tab-content2'));

    // add the animation to the tab
    function enhanceTab(tab, tabContent, easein){
      tab.click(function (e) {
          e.preventDefault();
          $(this).tab('show');
          var _existeaseIn = $(this).data('easein');
          if(_previewTabContent) _previewTabContent.removeClass(_previeweaseIn);
          if(_existeaseIn){
              tabContent.find('div.active').addClass('animated '+ _existeaseIn);
              _previeweaseIn = _existeaseIn;
          }else{
              if(easein){
                tabContent.find('div.active').addClass('animated '+ easein);
                _previeweaseIn = easein;
              }else{
                tabContent.find('div.active').addClass('animated '+ _easeIn);
                _previeweaseIn = _easeIn;
              }
          }
          _previewTabContent = tabContent.find('div.active');
      });

    }

    // add the animation to the popover
    $("a[rel=popover]").popover().click(function(e) {
        e.preventDefault();
        if($(this).data('easein')!=undefined){
          $(this).next().removeClass($(this).data('easein')).addClass('animated ' + $(this).data('easein'));
        }else{
          $(this).next().addClass('animated ' + _easeIn);
        }
    })
});
