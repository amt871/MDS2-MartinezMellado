import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-videos_perfil_bloqueado__item_';

@customElement('vista-videos_perfil_bloqueado')
export class VistaVideos_perfil_bloqueado extends LitElement {
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
<vaadin-vertical-layout style="height: 100%; width: 100%;">
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="height: 50%; width: 100%; align-items: center; align-self: center; justify-content: space-around; flex-shrink: 1; flex-grow: 0;">
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; align-items: center; justify-content: space-around; align-self: center;">
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 50%; justify-content: space-around; align-items: center; align-self: center;">
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
   <vista-videos_perfil_bloqueado__item_></vista-videos_perfil_bloqueado__item_>
  </vaadin-horizontal-layout>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
