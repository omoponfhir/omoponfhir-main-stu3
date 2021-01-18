# The FHIR Project at Georgia Tech

OMOPonFHIR server is a Georgia Tech's Fast Healthcare Interoperability Resources (FHIR) project to build a FHIR resource on Observational Medical Outcomes Partnership (OMOP) common data model (CDM). It is built on top of <a href="http://hapifhir.io">Hapi Fhir</a> libraries. Currently, OMOPonFHIR support DSTU2 and STU3.

The key component of GT-FHIR is a data access layer that has been modified to support any database schema. The component allows OMOP CDM to be deployed as a backend database. FHIR resources from/to OMOP CDM mapping is done at the gt-fhir-entities. However, as FHIR and OMOP CDM cannot be mapped one-to-one, some of data elements are set statically. Some mappings require multiple FHIR entity-jpa classes to support bidirectional mappings. 

OMOP to FHIR or FHIR to OMOP Mapping information can be found at [OHDSI FHIR Workgroup wiki page](https://www.ohdsi.org/web/wiki/doku.php?id=projects:workgroups:mappings_between_ohdsi_cdm_and_fhir).

We are constantly working on mapping new concepts and adding to new features. *Pull requests are welcome!* For more details on source codes, visit [OMOPonFHIR Project Github](https://github.com/omoponfhir/omoponfhir-main/).

## Current OMOPonFHIR Version
**Snapshot of OMOPonFHIR**: There is a public OMOPonFHIR site that shows the latest snapshot. This runs with HAPI-FHIR's UI Testpage running over Synpuff data source in OMOP v5. [OMOPonFHIR Snapshot Server](https://apps.hdap.gatech.edu/gt-fhir-smart/) 

**SMART on FHIR**: OMOPonFHIR is also equipped to support SMART on FHIR. OMOPonFHIR server has built-in services to support SMART on FHIR Authorization flow. This allows to simulate EHR-launching or stand-alone launching. The github page has a link to the smart on fhir launcher.

[Deployment scripts] OMOPonFHIR includes docker composer, which helps deploying the server in the docker container.

## People
**FHIR and Lead** 
 * [Myung Choi](https://github.com/myungchoi)

**OMOP CDM**
 * [Saul Crumpton](https://github.com/BSCrumpton)
 
**OMOP CDM**
 * [Richard Starr](https://github.com/orgs/gt-health/people/rstarr7)

**DevOp and Deployment Support**
 * [Eric Soto](https://github.com/soto14)
 
**Infrastructure**
 * [Michael Riley](https://github.com/MikeRileyGTRI)
 
## Collaborators
 * Apervita
 * Cerner
 * Docsnap
 * Duke University
 * Emory University School of Medicine
 * Medical University in South Carolina
 * Mulesoft
 * Salesforce
 * UCB
 * VA 
 
## Related Publications
 1. M. Choi, R. Starr, M. Braunstein, and J. Duke, "OHDSI on FHIR Platform Development with OMOP CDM mapping to FHIR Resources," [ODHSI 2016](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:ohdsionfhir_gatech.pdf)
 2. H. Su, A. Henderson, M. Choi, R. Starr, and J. Sun, "Clinical Predictive Modeling Development and Deployment with OMOP CDM and FHIR," [ODHSI 2015](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:gt_ohdsi-abs-final.pdf)
 3. K. Mohammed, M. Choi, A. Henderson, S. Iyengar, M. Braunstein, and J. Sun, "Clinical Predictive Modeling Development and Deployment through FHIR Web Services," [AMIA 2015](https://knowledge.amia.org/59310-amia-1.2741865/t004-1.2745466/f004-1.2745467/2248709-1.2745684/2248709-1.2745685?qr=1)
r
