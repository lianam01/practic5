class Polygon(point: Point, point2: Point, point4: Point, point1: Point) {
    var points: Array<Point>

    init {
        val _points = null
        points = _points as Array<Point>
    }

    fun moveOx(dx: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
        }
    }

    fun moveOy(dy: Double){
        for (i in points){
            i.y = i.y?.plus(dy)
        }
    }

    fun move(dx: Double, dy: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
            i.y = i.y?.plus(dy)
        }
    }

    override  fun toString():String{
        var str:String="Polygon: { "
        for (i in points){
            str+="(${i.x},${i.y}) "
        }
        str+="}"
        return str
    }
}