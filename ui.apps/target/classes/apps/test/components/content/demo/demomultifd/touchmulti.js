use( function () {

    var linksList = [];
    var linkArray = properties.get("linkMultifield");
    if(linkArray != null){
        for(var i = 0; i < linkArray.length; i++) {
        var singleObj = {};
        var itemObject =  JSON.parse(linkArray[i]);
        singleObj['title'] = itemObject.linktitle;
        singleObj['path'] = itemObject.linkpath;
        linksList.push(singleObj);
    };
    }

   return {
        linksList: linksList
    };
});