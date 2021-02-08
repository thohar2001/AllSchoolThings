public enum Container {
    WAFER, CUP;

    @Override
    public String toString() {
        switch (this) {
            case WAFER:
                return "wafer";
            case CUP:
                return "cup";
            default:
                return "unknown";
        }
        
    }

}


