import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mi_cabecera';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-notificaciones_item';

@customElement('vista-notificaciones')
export class VistaNotificaciones extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-mi_cabecera style="height: 5%; width: 100%;"></vista-mi_cabecera>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
  <vaadin-button id="idComentarios">
   Comentarios 
  </vaadin-button>
  <vaadin-button id="idMeGusta">
   Me gustas
  </vaadin-button>
  <vaadin-button id="idSeguidores">
   Seguidores 
  </vaadin-button>
  <vaadin-button id="idMenciones">
   Menciones 
  </vaadin-button>
  <vaadin-button id="idTodas">
    Todas
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-scroller style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
  <vista-notificaciones_item></vista-notificaciones_item>
  <vista-notificaciones_item></vista-notificaciones_item>
  <vista-notificaciones_item></vista-notificaciones_item>
  <vista-notificaciones_item></vista-notificaciones_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
