import store from './app/store'

store.dispatch(
    {
        type: 'sermons/sermonAdded',
        payload: {
            link: "https://www.youtube.com",
            date: '2022-02-17'
        }
    })

store.dispatch(
    {
        type: 'sermons/sermonAdded',
        payload: {
            link: "https://www.google.com",
            date: '2022-02-16'
        }
    })

store.dispatch(
    {
        type: 'filters/changeDate',
        payload: {
            fromDt: '2022-01-01',
            toDt: '2022-02-17'
        }
    })
