/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.jav;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CREATE_JSON {


    /**
     * @throws java.io.IOException
     */
    public void create_json() throws IOException{ 
          String p = "{\n" +
"  \"_D\": \"urn:oasis:names:specification:ubl:schema:xsd:Invoice-2\",\n" +
"  \"_S\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2\",\n" +
"  \"_B\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2\",\n" +
"  \"_E\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2\",\n" +
"  \"Invoice\": [\n" +
"    {\n" +
"      \"UBLVersionID\": [\n" +
"        {\n" +
"          \"IdentifierContent\": \"2.1\"\n" +
"        }\n" +
"      ],\n" +
"      \"CustomizationID\": [\n" +
"        {\n" +
"          \"IdentifierContent\": \"2.0\"\n" +
"        }\n" +
"      ],\n" +
"      \"ProfileID\": [\n" +
"        {\n" +
"          \"IdentifierContent\": \"";p =p+100+"\",\n" +
"          \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Tipo de Operación\",\n" +
"          \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
"          \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo17\"\n" +
"        }\n" +
"      ],\n" +
"      \"ID\": [\n" +
"        {\n" +
"          \"IdentifierContent\":\"F001-1\"\n" +
"        }\n" +
"      ],\n" +
"      \"IssueDate\": [\n" +
"        {\n" +
"          \"DateContent\": \"2018-10-30\"\n" +
"        }\n" +
"      ],\n" +
"      \"IssueTime\": [\n" +
"        {\n" +
"          \"DateTimeContent\": \"05:56:32\"\n" +
"        }\n" +
"      ],\n" +
"      \"InvoiceTypeCode\": [\n" +
"        {\n" +
"          \"CodeContent\": \"01\",\n" +
"          \"CodeListSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo01\",\n" +
"          \"CodeListNameText\": \"SUNAT:Identificador de Tipo de Documento\",\n" +
"          \"CodeListAgencyNameText\": \"PE:SUNAT\"\n" +
"        }\n" +
"      ],\n" +
"      \"Note\": [\n" +
"        {\n" +
"          \"TextContent\": \"cuarenta y cuatro con 00/100 SOLES\",\n" +
"          \"LanguageLocaleIdentifier\": \"1000\"\n" +
"        }\n" +
"      ],\n" +
"      \"DocumentCurrencyCode\": [\n" +
"        {\n" +
"          \"CodeContent\": \"PEN\",\n" +
"          \"CodeListIdentifier\": \"ISO 4217 Alpha\",\n" +
"          \"CodeListNameText\": \"Currency\",\n" +
"          \"CodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"        }\n" +
"      ],\n" +
"      \"LineCountNumeric\": [\n" +
"        {\n" +
"          \"NumericContent\": 3\n" +
"        }\n" +
"      ],\n" +
"      \"Signature\": [\n" +
"        {\n" +
"          \"ID\": [\n" +
"            {\n" +
"              \"IdentifierContent\": \"IDSignature\"\n" +
"            }\n" +
"          ],\n" +
"          \"SignatoryParty\": [\n" +
"            {\n" +
"              \"PartyIdentification\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"20603430949\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ],\n" +
"              \"PartyName\": [\n" +
"                {\n" +
"                  \"Name\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"CORPORACION RUMBA Y SAZON E.I.R.L.\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"DigitalSignatureAttachment\": [\n" +
"            {\n" +
"              \"ExternalReference\": [\n" +
"                {\n" +
"                  \"URI\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"IDSignature\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ],\n" +
"      \"AccountingSupplierParty\": [\n" +
"        {\n" +
"          \"Party\": [\n" +
"            {\n" +
"              \"PartyName\": [\n" +
"                {\n" +
"                  \"Name\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"-\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ],\n" +
"              \"PostalAddress\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"140106\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"StreetName\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"AV. EL RETABLO NRO. 1431 URB. PRIMAVERA LIMA - LIMA - COMAS\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"CityName\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"LIMA\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"CountrySubentity\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"LIMA\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"District\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"COMAS\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"Country\": [\n" +
"                    {\n" +
"                      \"IdentificationCode\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"PE\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ],\n" +
"              \"PartyTaxScheme\": [\n" +
"                {\n" +
"                  \"RegistrationName\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"CORPORACION RUMBA Y SAZON E.I.R.L.\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"CompanyID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"20603430949\",\n" +
"                      \"IdentificationSchemeIdentifier\": \"6\",\n" +
"                      \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Documento de Identidad\",\n" +
"                      \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
"                      \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"RegistrationAddress\": [\n" +
"                    {\n" +
"                      \"AddressTypeCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"0001\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxScheme\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"-\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ],\n" +
"      \"AccountingCustomerParty\": [\n" +
"        {\n" +
"          \"Party\": [\n" +
"            {\n" +
"              \"PostalAddress\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"StreetName\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"AV. JOSE PARDO NRO. 329 DPTO. 803 (CDRA.3 AV.PARDO) LIMA - LIMA - MIRAFLORES\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ],\n" +
"              \"PartyTaxScheme\": [\n" +
"                {\n" +
"                  \"RegistrationName\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"P.A.DESARROLLOS INMOBILIAR.Y CONST.S.A.C\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"CompanyID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"20386362603\",\n" +
"                      \"IdentificationSchemeIdentifier\": \"6\",\n" +
"                      \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Documento de Identidad\",\n" +
"                      \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
"                      \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"RegistrationAddress\": [\n" +
"                    {\n" +
"                      \"AddressTypeCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"0001\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxScheme\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"-\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ],\n" +
"              \"Contact\": [\n" +
"                {\n" +
"                  \"ElectronicMail\": [\n" +
"                    {\n" +
"                      \"TextContent\": \"fmontes@efact.pe\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ],\n" +
"      \"TaxTotal\": [\n" +
"        {\n" +
"          \"TaxAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"6.71\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"TaxSubtotal\": [\n" +
"            {\n" +
"              \"TaxableAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"37.29\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ],\n" +
"              \"TaxAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"6.71\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ],\n" +
"              \"TaxCategory\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"S\",\n" +
"                      \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
"                      \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
"                      \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"Percent\": [\n" +
"                    {\n" +
"                      \"NumericContent\": 18\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxScheme\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"1000\",\n" +
"                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
"                          \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"Name\": [\n" +
"                        {\n" +
"                          \"TextContent\": \"IGV\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxTypeCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"VAT\"\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ],\n" +
"      \"LegalMonetaryTotal\": [\n" +
"        {\n" +
"          \"LineExtensionAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"44.00\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"TaxInclusiveAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"44\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"PayableAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"44\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ],\n" +
"      \"InvoiceLine\": [\n" +
"        {\n" +
"          \"ID\": [\n" +
"            {\n" +
"              \"IdentifierContent\": 1\n" +
"            }\n" +
"          ],\n" +
"          \"Note\": [\n" +
"            {\n" +
"              \"TextContent\": \"NIU\"\n" +
"            }\n" +
"          ],\n" +
"          \"InvoicedQuantity\": [\n" +
"            {\n" +
"              \"QuantityContent\": \"1.00\",\n" +
"              \"QuantityUnitCode\": \"NIU\",\n" +
"              \"QuantityUnitCodeListIdentifier\": \"UN/ECE rec 20\",\n" +
"              \"QuantityUnitCodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"            }\n" +
"          ],\n" +
"          \"LineExtensionAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"3.39\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"PricingReference\": [\n" +
"            {\n" +
"              \"AlternativeConditionPrice\": [\n" +
"                {\n" +
"                  \"PriceAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"4.000\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"PriceTypeCode\": [\n" +
"                    {\n" +
"                      \"CodeContent\": \"01\",\n" +
"                      \"CodeListNameText\": \"SUNAT:Indicador de Tipo de Precio\",\n" +
"                      \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                      \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"TaxTotal\": [\n" +
"            {\n" +
"              \"TaxAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"0.61\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ],\n" +
"              \"TaxSubtotal\": [\n" +
"                {\n" +
"                  \"TaxableAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"4.00\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"0.61\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxCategory\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"S\",\n" +
"                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
"                          \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
"                          \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxExemptionReasonCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"10\",\n" +
"                          \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                          \"CodeListNameText\": \"SUNAT:Codigo de Tipo de Afectación del IGV\",\n" +
"                          \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxScheme\": [\n" +
"                        {\n" +
"                          \"ID\": [\n" +
"                            {\n" +
"                              \"IdentifierContent\": \"1000\",\n" +
"                              \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
"                              \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"Name\": [\n" +
"                            {\n" +
"                              \"TextContent\": \"IGV\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"TaxTypeCode\": [\n" +
"                            {\n" +
"                              \"CodeContent\": \"VAT\"\n" +
"                            }\n" +
"                          ]\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Item\": [\n" +
"            {\n" +
"              \"Description\": [\n" +
"                {\n" +
"                  \"TextContent\": \"Porcion de Arroz Verde\"\n" +
"                }\n" +
"              ],\n" +
"              \"SellersItemIdentification\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"46\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Price\": [\n" +
"            {\n" +
"              \"PriceAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"4.000\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        },\n" +
"        {\n" +
"          \"ID\": [\n" +
"            {\n" +
"              \"IdentifierContent\": 2\n" +
"            }\n" +
"          ],\n" +
"          \"Note\": [\n" +
"            {\n" +
"              \"TextContent\": \"NIU\"\n" +
"            }\n" +
"          ],\n" +
"          \"InvoicedQuantity\": [\n" +
"            {\n" +
"              \"QuantityContent\": \"1.00\",\n" +
"              \"QuantityUnitCode\": \"NIU\",\n" +
"              \"QuantityUnitCodeListIdentifier\": \"UN/ECE rec 20\",\n" +
"              \"QuantityUnitCodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"            }\n" +
"          ],\n" +
"          \"LineExtensionAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"25.42\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"PricingReference\": [\n" +
"            {\n" +
"              \"AlternativeConditionPrice\": [\n" +
"                {\n" +
"                  \"PriceAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"30.000\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"PriceTypeCode\": [\n" +
"                    {\n" +
"                      \"CodeContent\": \"01\",\n" +
"                      \"CodeListNameText\": \"SUNAT:Indicador de Tipo de Precio\",\n" +
"                      \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                      \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"TaxTotal\": [\n" +
"            {\n" +
"              \"TaxAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"4.58\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ],\n" +
"              \"TaxSubtotal\": [\n" +
"                {\n" +
"                  \"TaxableAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"30.00\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"4.58\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxCategory\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"S\",\n" +
"                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
"                          \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
"                          \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxExemptionReasonCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"10\",\n" +
"                          \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                          \"CodeListNameText\": \"SUNAT:Codigo de Tipo de Afectación del IGV\",\n" +
"                          \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxScheme\": [\n" +
"                        {\n" +
"                          \"ID\": [\n" +
"                            {\n" +
"                              \"IdentifierContent\": \"1000\",\n" +
"                              \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
"                              \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"Name\": [\n" +
"                            {\n" +
"                              \"TextContent\": \"IGV\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"TaxTypeCode\": [\n" +
"                            {\n" +
"                              \"CodeContent\": \"VAT\"\n" +
"                            }\n" +
"                          ]\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Item\": [\n" +
"            {\n" +
"              \"Description\": [\n" +
"                {\n" +
"                  \"TextContent\": \"Duo Rumba y Sazon\"\n" +
"                }\n" +
"              ],\n" +
"              \"SellersItemIdentification\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"19\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Price\": [\n" +
"            {\n" +
"              \"PriceAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"30.000\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        },\n" +
"        {\n" +
"          \"ID\": [\n" +
"            {\n" +
"              \"IdentifierContent\": 3\n" +
"            }\n" +
"          ],\n" +
"          \"Note\": [\n" +
"            {\n" +
"              \"TextContent\": \"NIU\"\n" +
"            }\n" +
"          ],\n" +
"          \"InvoicedQuantity\": [\n" +
"            {\n" +
"              \"QuantityContent\": \"1.00\",\n" +
"              \"QuantityUnitCode\": \"NIU\",\n" +
"              \"QuantityUnitCodeListIdentifier\": \"UN/ECE rec 20\",\n" +
"              \"QuantityUnitCodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"            }\n" +
"          ],\n" +
"          \"LineExtensionAmount\": [\n" +
"            {\n" +
"              \"AmountContent\": \"8.47\",\n" +
"              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"            }\n" +
"          ],\n" +
"          \"PricingReference\": [\n" +
"            {\n" +
"              \"AlternativeConditionPrice\": [\n" +
"                {\n" +
"                  \"PriceAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"10.000\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"PriceTypeCode\": [\n" +
"                    {\n" +
"                      \"CodeContent\": \"01\",\n" +
"                      \"CodeListNameText\": \"SUNAT:Indicador de Tipo de Precio\",\n" +
"                      \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                      \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"TaxTotal\": [\n" +
"            {\n" +
"              \"TaxAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"1.53\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ],\n" +
"              \"TaxSubtotal\": [\n" +
"                {\n" +
"                  \"TaxableAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"10.00\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxAmount\": [\n" +
"                    {\n" +
"                      \"AmountContent\": \"1.53\",\n" +
"                      \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                    }\n" +
"                  ],\n" +
"                  \"TaxCategory\": [\n" +
"                    {\n" +
"                      \"ID\": [\n" +
"                        {\n" +
"                          \"IdentifierContent\": \"S\",\n" +
"                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
"                          \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
"                          \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxExemptionReasonCode\": [\n" +
"                        {\n" +
"                          \"CodeContent\": \"10\",\n" +
"                          \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
"                          \"CodeListNameText\": \"SUNAT:Codigo de Tipo de Afectación del IGV\",\n" +
"                          \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07\"\n" +
"                        }\n" +
"                      ],\n" +
"                      \"TaxScheme\": [\n" +
"                        {\n" +
"                          \"ID\": [\n" +
"                            {\n" +
"                              \"IdentifierContent\": \"1000\",\n" +
"                              \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
"                              \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"Name\": [\n" +
"                            {\n" +
"                              \"TextContent\": \"IGV\"\n" +
"                            }\n" +
"                          ],\n" +
"                          \"TaxTypeCode\": [\n" +
"                            {\n" +
"                              \"CodeContent\": \"VAT\"\n" +
"                            }\n" +
"                          ]\n" +
"                        }\n" +
"                      ]\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Item\": [\n" +
"            {\n" +
"              \"Description\": [\n" +
"                {\n" +
"                  \"TextContent\": \"Jarra de Chicha 1Ltr\"\n" +
"                }\n" +
"              ],\n" +
"              \"SellersItemIdentification\": [\n" +
"                {\n" +
"                  \"ID\": [\n" +
"                    {\n" +
"                      \"IdentifierContent\": \"55\"\n" +
"                    }\n" +
"                  ]\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ],\n" +
"          \"Price\": [\n" +
"            {\n" +
"              \"PriceAmount\": [\n" +
"                {\n" +
"                  \"AmountContent\": \"10.000\",\n" +
"                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
"                }\n" +
"              ]\n" +
"            }\n" +
"          ]\n" +
"        }\n" +
"      ]\n" +
"    }\n" +
"  ]\n" +
"}";
                
                
                BufferedWriter writer = null;
                writer = new BufferedWriter( new FileWriter( "D:\\JODER-JSON.json"));
                writer.write( p);
                try
                {
                    if ( writer != null)
                        writer.close( );
                }
                catch ( IOException e)
                {
                }
      
     }
   
    
}
