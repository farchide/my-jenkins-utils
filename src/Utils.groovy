class Utils {
    static def info(def steps, String message)
    {
        steps.echo("Hello there $message")
    }

    static def warning(def steps, String message) 
    {
        steps.echo("Hello there $message")
    }
}