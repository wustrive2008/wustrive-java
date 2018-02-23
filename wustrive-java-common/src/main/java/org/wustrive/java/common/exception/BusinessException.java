package org.wustrive.java.common.exception;


public class BusinessException extends Exception{
    private static final long serialVersionUID = -6825665437797680288L;

    protected int state;
    
    public BusinessException() {
        super();
        this.state = 30001;
    }

    public BusinessException(String message) {
        super(message);
        this.state = 30001;
    }

    public BusinessException(int state, String message) {
        super(message);
        this.state = state;
    }

    /**
     * Getter method for property <tt>state</tt>.
     * 
     * @return property value of state
     */
    public int getState() {
        return state;
    }

    /**
     * @see Throwable#fillInStackTrace()
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
