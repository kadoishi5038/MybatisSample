'use strict';

//フォーム名を指定して新しいウィンドウを開く
function openWin(formName){
    let form = document.forms[formName];
    if(!form){
        alert('指定したフォームが取得できませんでした');
        return;
    }
	// なんかいれてみた
    let win = window.open('about:blank', formName);
    form.target = formName;
    form.submit();
    win.focus();
}

function add(){
 var table = document.getElementById("tblbody");
 var row = table.insertRow(-1);
  //this adds row in 0 index i.e. first place
 row.innerHTML = "<td> </td><td> </td><td> </td><td> </td><td> </td><td> </td><td> </td>";
}

//以下、末尾行削除処理
function del(){

  //繰り返し使うtableだけ先に定数に格納
  const tbl = document.getElementById("tbl");

  let rw = tbl.rows.length;//行数取得
  tbl.deleteRow(rw-1);//最終行を指定して削除

}




