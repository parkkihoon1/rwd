const btnNext = document.querySelectorAll('.mainBtnNext');
const btnPrev = document.querySelectorAll('.mainBtnPrev');
const seasonList = document.querySelector('.seasonList');
const goodList = document.querySelector('.goodList');
const headerW = document.querySelector('body > #headerWrap');

let width = parseInt($('.seasonList').css('width'))/2;

btnNext[2].addEventListener('click',()=>{
seasonList.style.transform = `translateX(-${width}px)`;
})
btnPrev[2].addEventListener('click',()=>{
seasonList.style.transform = 'translateX(0)';
})

const gnbView = document.querySelector('.gnbView');
const gnb = document.querySelector('#gnb');
const gnbListBtn = document.querySelector('.gnbListBtn')

gnbView.addEventListener('click',()=>{
gnb.style.left = '0px'; 
})
gnbListBtn.addEventListener('click',()=>{
gnb.style.left = '-100%';
})

// pc menu
$('#headerWrap').on('mouseenter',function(){
    $(this).addClass('on');
})
$('#headerWrap').on('mouseleave',function(){
    $(this).removeClass('on');
})

if($(window).width() <= 1080 ){
    $('.snb').slideUp();
    $('#gnbList >li > a').on('click',function(){
        $('.snb').stop().slideUp();
        $(this).next().stop().slideToggle();
    })
}

let resizing = ()=> {
    if($(window).width() >= 1080 ){
        $('#headeWrap').removeClass('on');
        $('.snb').slideDown();
    }
    else {
        // $('.snb').slideDown().css({
        //     display:'none'
        // });
        $('.snb').slideUp();
        $('#gnbList >li > a').on('click',function(){
            $('.snb').stop().slideUp();
            $(this).next().stop().slideToggle();
        })
    }
}
$(window).on('resize',function(){
    resizing();
}) 

$("#mainSliderList").bxSlider({
    auto: true,
    autoControls: true,
    stopAutoOnClick: true,
    pager: true
  });
  
  
  let num = 0;

  if( $(window).width() > 783 ){
    width = $(window).width();
    if( width >= 1440) width = 1440;
    btnNext[1].addEventListener('click',()=>{
        goodList.style.transform = `translateX(-${width}px)`;
    })
    btnPrev[1].addEventListener('click',()=>{
        goodList.style.transform = 'translateX(0)';
    })
  }
  else {
    width = $(window).width();
    btnNext[1].addEventListener('click',()=>{
        console.log(num);
        if(num == 5 ) num=5;
        else {
            num++;
            goodList.style.transform = `translateX(-${width * num}px)`;
        }
    })
    btnPrev[1].addEventListener('click',()=>{
        console.log(num);
        if(num == 0 ) num=0;
        else {
            num--;
            goodList.style.transform = `translateX(-${width * num}px)`;
        }
    })
  }


  $('.next').on('click',function(){
    $('#withInner').animate({
        marginLeft: -770
    })
  })
  $('.prev').on('click',function(){
    $('#withInner').animate({
        marginLeft: 0
    })
  })