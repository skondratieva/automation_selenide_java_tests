package NewsletterForm.Elements;

import Base.BaseTest;
import NewsletterForm.Elements.Elements;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.apache.metamodel.data.Row;
import org.apache.metamodel.schema.Table;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.data.DataSet;
import org.apache.metamodel.factory.DataContextFactoryRegistryImpl;
import org.apache.metamodel.factory.DataContextPropertiesImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class ElementsTest extends BaseTest {
    String language;

    @BeforeClass
    public void beforeClass(ITestContext context) {
        this.language = context.getCurrentXmlTest().getParameter("language");
    }
    @Test (dataProvider = "NewsletterFormElements")
    public void Elements(String Title, String NomField, String PrenomField, String EmailField, String FunctionField, String SociétéField,
                         String SecteurField, String TelField, String AdresseField, String VilleField, String CodePostalField,
                         String PaysField, String Checkbox){

        Elements elements = new Elements(language);

        elements
                .open()
                .getForm()
                .checkElements(Title, NomField, PrenomField, EmailField, FunctionField, SociétéField, SecteurField, TelField, AdresseField,
                        VilleField, CodePostalField, PaysField, Checkbox);
    }

    @DataProvider (name = "NewsletterFormElements")
    public Object[][] rloginForm() {
        // https://cwiki.apache.org/confluence/pages/viewpage.action?pageId=65875503
        DataContextPropertiesImpl properties = new DataContextPropertiesImpl();
        properties.put("type", "csv");
        properties.put("resource", "src/test/resources/NewsletterForm." + language + ".csv");
        properties.put("quote-char", '"');
        properties.put("separator-char", ',');
        properties.put("encoding", "UTF-8" );

        DataContext dataContext = DataContextFactoryRegistryImpl.getDefaultInstance().createDataContext(properties);

        Table table = dataContext.getDefaultSchema().getTable(0);
        DataSet dataSet = dataContext.query()
                .from( table )
                .selectAll()
                .execute();

        List<Row> rows = dataSet.toRows();

        Object[][] result = new Object[rows.size()][rows.get(0).size()];
        for(int i=0; i < rows.size(); i++){
            result[i] = rows.get(i).getValues();
        }

        return result;
    }
}