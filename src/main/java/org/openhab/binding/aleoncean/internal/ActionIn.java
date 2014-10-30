package org.openhab.binding.aleoncean.internal;

public enum ActionIn {
    DEFAULT,
    COMMAND,
    STATE;

    public static ActionIn parse(final String s) {
        final ActionIn action;

        switch (s) {
            case "d":
                action = DEFAULT;
                break;
            case "c":
                action = COMMAND;
                break;
            case "s":
                action = STATE;
                break;
            default:
                throw new IllegalArgumentException("Invalid incoming action: " + s);
        }

        return action;
    }
}
