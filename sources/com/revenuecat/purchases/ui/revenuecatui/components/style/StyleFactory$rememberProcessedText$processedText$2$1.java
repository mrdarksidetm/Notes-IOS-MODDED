package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.s;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.Locale;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class StyleFactory$rememberProcessedText$processedText$2$1 extends s implements a<String> {
    final /* synthetic */ Locale $locale;
    final /* synthetic */ String $originalText;
    final /* synthetic */ PackageContext $packageContext;
    final /* synthetic */ VariableDataProvider $variables;
    final /* synthetic */ StyleFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StyleFactory$rememberProcessedText$processedText$2$1(PackageContext packageContext, String str, StyleFactory styleFactory, VariableDataProvider variableDataProvider, Locale locale) {
        super(0);
        this.$packageContext = packageContext;
        this.$originalText = str;
        this.this$0 = styleFactory;
        this.$variables = variableDataProvider;
        this.$locale = locale;
    }

    @Override // zd.a
    public final String invoke() {
        Package selectedPackage = this.$packageContext.getSelectedPackage();
        if (selectedPackage != null) {
            StyleFactory styleFactory = this.this$0;
            PackageContext packageContext = this.$packageContext;
            VariableDataProvider variableDataProvider = this.$variables;
            String str = this.$originalText;
            Locale locale = this.$locale;
            Price pricePricePerMonth$default = StoreProduct.DefaultImpls.pricePerMonth$default(selectedPackage.getProduct(), null, 1, null);
            String strProcessVariables = VariableProcessor.INSTANCE.processVariables(variableDataProvider, new VariableProcessor.PackageContext(styleFactory.discountPercentage(pricePricePerMonth$default != null ? Long.valueOf(pricePricePerMonth$default.getAmountMicros()) : null, packageContext.getVariableContext().getMostExpensivePricePerMonthMicros()), packageContext.getVariableContext().getShowZeroDecimalPlacePrices()), str, selectedPackage, locale);
            if (strProcessVariables != null) {
                return strProcessVariables;
            }
        }
        return this.$originalText;
    }
}
