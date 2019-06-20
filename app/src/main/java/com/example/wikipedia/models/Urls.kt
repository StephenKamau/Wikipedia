package com.example.wikipedia.models

object Urls {
    val BASE_URL="https://en.wikipedia.org/w/api.php"
    fun getSearchUrl(term:String,skip:Int,take:Int):String{
        return BASE_URL +
                "?action=query"+
                "&formatversion=2"+
                "&generator=prefixsearch"+
                "&gpssearch=$term"+
                "&gpslimit=$take"+
                "&gpsoffset=$skip"+
                "&prop=pageimages|info"+
                "piprop=thumbnail|url"+
                "&pithumbsize=200"+
                "&pilimit=$take"+
                "&wbptterms=description"+
                "&format=json"+
                "&inprop=url"

    }

    fun getRandomSearchUrl(take:Int):String{
        return BASE_URL+
                "?action=query"+
                "format=json"+
                "&formatversion=2"+
                "&generator=random"+
                "&grnnamespace=0"+
                "&prop=pageimages|info"+
                "&grnlimit=$take"+
                "&inprop=url"+
                "&pithumbsize=200"
    }
}