def call(Map map=[:]){
	step([
		$class: 'CxScanBuilder',
		credentialsId: 'cx',
		comment: "${env.JOB_BASE_NAME}-${env.BUILD_ID}",
		exclusionSetting: 'global',
		fullScanCycle: 10,
		groupId: '54c620ff-479b-4c6c-88ba-1c89ee159c84', 
		preset: '36', 
		projectName: env.JOB_BASE_NAME,
		serverUrl: 'https:\\cxlocal',
		sourceEncoding: '1',
		generatePDFReport: false,
		waitForResultsEnabled: false
	])
}