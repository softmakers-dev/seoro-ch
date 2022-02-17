import { combineReducers } from "@reduxjs/toolkit";

import sermonsReducer from './features/sermons/sermonsSlice'
import filtersReducer from './features/filters/filtersSlice'

const rootReducer = combineReducers({
    sermons: sermonsReducer,
    filters: filtersReducer
})

export default rootReducer
