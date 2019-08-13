class Utils {
    static def info(def steps, String message)
    {
        script.echo("INFO: $message")
    }

    static def warning(def steps, String message) 
    {
        script.echo("WARNING: $message")
    }
}