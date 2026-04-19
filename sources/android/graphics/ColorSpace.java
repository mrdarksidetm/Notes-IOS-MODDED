package android.graphics;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class ColorSpace {

    public final /* synthetic */ class Named extends Enum {
        static {
            throw new NoClassDefFoundError();
        }
    }

    public /* synthetic */ class Rgb extends ColorSpace {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Rgb(String str, float[] fArr, float[] fArr2, TransferParameters transferParameters) {
        }

        public /* synthetic */ Rgb(String str, float[] fArr, float[] fArr2, DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, float f10, float f11) {
        }

        public native /* synthetic */ DoubleUnaryOperator getEotf();

        public native /* synthetic */ DoubleUnaryOperator getOetf();

        public native /* synthetic */ float[] getPrimaries();

        public native /* synthetic */ TransferParameters getTransferParameters();

        public native /* synthetic */ float[] getTransform();

        public native /* synthetic */ float[] getWhitePoint();
    }

    static {
        throw new NoClassDefFoundError();
    }

    public static native /* synthetic */ ColorSpace get(Named named);

    public native /* synthetic */ int getId();

    public abstract /* synthetic */ float getMaxValue(int i10);

    public abstract /* synthetic */ float getMinValue(int i10);
}
