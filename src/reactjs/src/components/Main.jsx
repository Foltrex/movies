import React from 'react';

import '../assets/css/Main.css'

import Card from 'react-bootstrap/Card';
import defaultImage from '../assets/images/defaultImage.png';

const Main = () => { 
    const list = [
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
        {
            title:'На кого из Принцесс Disney вы похожи?',
            text:'Принцессы Дисней'
        },
    ];

    return (
        <div id='main-container' className='container shadow bg-white'>
            <ContentGroup title='Tests' list={list}/>
            <hr/>
            <ContentGroup title='Films' list={list}/>
            <hr />
            <ContentGroup title='Cartoons' list={list}/>
            <hr />
            <ContentGroup title='Wiki' list={list}/>
        </div>
    );
}

const ContentGroup = props => {
    const title = props.title;
    let list = props.list;
    list = list.map(el => {
        return  <>
                    <ContentCard 
                        cardTitle={el.title}
                        cardText={el.text}
                    />
                </>
    });

    return (
        <div className='px-5 py-4'>
            <h2 className='sectionTitle'>{title}</h2>
            <div className='content-list'>
                {list}
            </div>
        </div>
    );
}

const ContentCard = props => {
    const {imageSrc, cardTitle, cardText} = props;

    return (
        <Card className='content-card col-3 mx-2 border-0'>
            <a href='#'>
                <Card.Img className='mt-3' variant="top" src={imageSrc || defaultImage} alt='Card cap'/>
            </a>       
            <Card.Body>
                <Card.Title>
                    <a className='card-title' href='#'>{cardTitle}</a>
                </Card.Title>
                <Card.Text>{cardText}</Card.Text>
            </Card.Body>
        </Card>
    );
}

export default Main;
