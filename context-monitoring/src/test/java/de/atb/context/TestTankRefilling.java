package de.atb.context;

import de.atb.context.common.util.ApplicationScenario;
import de.atb.context.monitoring.models.TankRefillingMonitoringData;
import de.atb.context.persistence.monitoring.MonitoringDataRepository;
import de.atb.context.services.faults.ContextFault;
import org.junit.Test;

/**
 * TankTest
 * 
 * @author scholze
 * @version $LastChangedRevision: 735 $
 * 
 */
public class TestTankRefilling {

	@Test
	public void doNothing() {
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ContextFault {
//		ServiceManager.registerWebservice(SWService.AdaptationRepositoryService);
//		ServiceManager.registerWebservice(SWService.ContextExtractionService);

		MonitoringDataRepository<TankRefillingMonitoringData> repos = (MonitoringDataRepository<TankRefillingMonitoringData>)  MonitoringDataRepository
				.getInstance();
		final TankRefillingMonitoringData analysed = repos.getMonitoringData(ApplicationScenario.getInstance(),
				TankRefillingMonitoringData.class, "ContextId_TankRefilling");
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
//				adapterService.informAboutContextChange(analysed.getApplicationScenario(), analysed.getIdentifier());
			}
		});
		t.start();
	}
}
